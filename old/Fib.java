class Fib {


    public static int fib(int n) {
        return fib(n,new int[n+1]);
    }

    public static int fib(int n, int [] memo) {

        if (n==0) return 0;
        if (n==1) return 1;

        if ( memo[n] == 0 ) {
           memo[n] = fib(n-1,memo) + fib(n-2,memo);
        }

        return memo[n];
    }


    public static void main(String [] args) {
        System.out.println(fib(42));
    }

}
