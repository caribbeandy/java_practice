class DP {


    static int fib (int n) {
        return fib(n, new int[n+1]);
    }


    static int fib(int i, int [] memo) {

        if (i==0 || i==1) return i;

        //if (memo[i] == 0)
            memo[i] = fib(i-1, memo) + fib(i-2, memo);

        return memo[i];
    }


    public static void main(String [] args) {

        System.out.println(fib(50));
    }
}
