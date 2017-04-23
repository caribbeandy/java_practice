import java.util.*;
class Prime {


    public static List<Integer> primeFactors(int n) {

        List<Integer> list = new ArrayList<Integer>();

        int sqrt = (int)Math.sqrt(n);

        for(int i=2; i<=sqrt; i++) {
            if (n%i==0 && isPrime(i)) {
                list.add(i);

                if (isPrime(n/i)) {
                    list.add(n/i);
                }
            }
        }

        return list;
    }

    public static boolean isPrime(int n) {

        int sqrt = (int)Math.sqrt(n);

        for(int i=2; i<=sqrt; i++) {
            if (n%i==0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String [] args) {

        for(int i: primeFactors(315))
            System.out.println(i);
    }

}
