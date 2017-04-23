import java.util.Arrays;
class QuickSortTwo {






    public static void sort(int [] a, int start, int end) {
    
        if ( start >= end) {
            return;
        }

        int pivot = partition(a, start, end);
        sort(a, start, pivot-1);
        sort(a, pivot+1, end);
    }

    public static void sort(int [] a) {
        sort(a, 0, a.length-1);
    }

    public static int partition(int [] a, int start, int end) {

        int j=start;
        int tmp;

        for(int i=start; i<end; i++) {
        
            if (a[i] < a[end]) {
                tmp = a[j];
                a[j] = a[i];
                a[i] = tmp;
                j++;
            }
        }

        tmp = a[j];
        a[j] = a[end];
        a[end] = tmp;

        return j;
    }

    public static void main(String [] args) {

        int [] a = new int []{2,8,7,1,3,5,6,4};

        System.out.println(Arrays.toString(a));
        sort(a);

        // Sorted!
        System.out.println(Arrays.toString(a));
    }


}
