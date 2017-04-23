import java.util.Arrays;
class InsertionSort {


    public static void sort(int [] a) {

        for(int i=1; i<a.length; i++) {

            int key = a[i];

            int j = i-1;

            while(j>-1 && a[j]>key) {
                a[j+1] = a[j];
                j=j-1;
            }

            a[j+1] = key;
        }

    }

    public static void main(String [] args) {
        
        int [] a = new int[]{5,2,4,6,1,3};
        sort(a);
        System.out.println(Arrays.toString(a));

    }
}
