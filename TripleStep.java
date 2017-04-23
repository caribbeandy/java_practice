import java.util.Scanner;
class TripleStep{


    public static void main(String [] args) {

        Scanner keyboard = new Scanner(System.in);

        while(true) {
            int n = keyboard.nextInt();
            a = new int[n+1];
            System.out.println(tripleStep(n));    
            System.out.println(fibonacci(n));    
        }
    }

    static int [] a;

	public static int fibonacci(int n) {

		if (n<0) return 0;

		if (n == 0) return 1;
		else if (n == 1) return 1;
		else if (n == 2) return 2;
		
		int[] memo = new int[n+1];

		memo[0] = 1;
		memo[1] = 1;
		memo[2] = 2;

		for (int i = 3; i < n; i++) {
			memo[i] = memo[i - 1] + memo[i - 2] + memo[i - 3];
		}

		return memo[n - 1] + memo[n - 2] + memo[n-3];
	}

    public static int tripleStep(int n) {

        if (n<0)
            return 0;

        if (n==0) {
            return 1;
        }

        if (a[n]!=0) return a[n];

        return a[n] = tripleStep(--n) + tripleStep(--n) + tripleStep(--n);
    }
}
