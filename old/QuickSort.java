import java.util.Arrays;
class QuickSort {

    public static void quickSort(int [] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int [] arr, int low, int high) {

        int pivot;

        if ( low < high ) {
            pivot = partition(arr, low, high);            
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    // Lomuto partition scheme
    static int partition(int [] arr, int low, int high) {

        // Choose pivot as last index
        int pivotVal = arr[high];

        // Everything to the left of i, is always <= pivotVal
        int i = low-1;

        // tmp var
        int tmp;

        for(int j=low; j<=high-1; j++) {

            if ( arr[j] <= pivotVal ) {
                i++;

                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        tmp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = tmp;

        return i+1;
    }

    public static void main(String [] args) {

        int [] a = new int []{2,8,7,1,3,5,6,4};

        System.out.println(Arrays.toString(a));
        quickSort(a);

        // Sorted!
        System.out.println(Arrays.toString(a));
    }

}
