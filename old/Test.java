class Test {

    public static int memoizedCutRod(int [] prices, int n) {
    
        // memoized
        int [] m = new int[n+1];

        for(int i=0; i<=n; i++){
            m[i] =  Integer.MIN_VALUE;
        }

        return memoizedCutRod(prices, n, m); 
    }

    public static int memoizedCutRod(int [] prices, int n, int [] m){

        if (m[n] >= 0) {
            return prices[n];
        }

        int q;

        if (n==0) {
            q = 0;
        } else {
            q = Integer.MIN_VALUE; 

            for(int i=1;i<=n;i++) {
                q = Math.max(q, prices[i] + memoizedCutRod(prices,n-i,m));
            }
        }

        // save it
        m[n] = q;

        // return it
        return q;
    }

    public static int bottomUpCutRod(int [] prices, int n) {

        int [] m = new int[n+1];

        // base case of 0 length
        m[0] = 0;

        for(int j=1; j<=n; j++) {
            
            int q = Integer.MIN_VALUE; 
            for(int i=0; i<=j; i++){
                q = Math.max(q,prices[i] + m[j-i]);
            }
            
            m[j] = q;
        }
        return prices[n];
    }

    public static int naiveCutRod(int [] prices, int n) {

        if ( n<=0 ) {
            return 0;
        }

        int max = Integer.MIN_VALUE;

        for(int i=1; i<=n; i++) {
        
            int q = prices[i] + naiveCutRod(prices, n-i);

            if (q > max) {
                max = q;
            }
        }

        return max;
    }
    

    public static void main(String [] args) {
       int [] a = new int[]{0,1,5,8,9,10,17,17,20,24,30};
       System.out.println(naiveCutRod(a, 10));
    }
}
