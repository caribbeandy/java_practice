import java.util.Random;

class Max {


    public static int max_brute_force(int [] a) {

        float max = Float.NEGATIVE_INFINITY;

        float x=max,y=max;

        for(int i=0; i<a.length; i++) {

            for(int j=i; j<a.length; j++) {

                if (a[i] < a[j]) {
                    if (j-i > max) {
                        x=a[i];
                        y=a[j];
                        max = j-i;
                    }
                }
            }
        }

        System.out.println("a[i]");
        System.out.println(x);
        
        System.out.println("a[j]");
        System.out.println(y);

        return (int)max;
    }


    public static void main(String [] args) {

        int size = 7; 

        int [] a = new int[7];

        Random random = new Random();

        System.out.println("Arr:");
        for(int i=0; i<a.length; i++) {
            a[i] = random.nextInt(5 - 1 + 1) + 1;
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println(max_brute_force(a));


    }

}
