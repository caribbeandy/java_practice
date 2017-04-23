class Backtrack{


    public static void main(String [] args) {
        parens(4);
    }


    public static void parens(int n) {
        parens(n,0,0, ""); 
    }

    public static void parens(int n, int lCount, int rCount, String s) {

        if (lCount > n || rCount > lCount)
            return;

        if (lCount==n && rCount==n) {
            System.out.println(s); 
        }

        if (lCount < n) {
            parens(n, lCount+1, rCount, s + "(");
        }

        if (rCount < n) {
            parens(n, lCount, rCount+1, s + ")");
        }
    }
}
