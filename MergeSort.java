import java.util.Arrays;
class MergeSort {


    public static void mergeSort(int [] a, int start, int end) {

        if ( start < end ) {
            int mid = (start+end)/2;

            mergeSort(a,start,mid);
            mergeSort(a,mid+1,end);
            merge(a,start,mid,end);
        }
    }

    public static void merge(int [] a, int start, int mid, int end) {

        int leftCount = mid-start+1;
        int rightCount = end-mid;

        int [] left = new int[leftCount+1];
        int [] right = new int[rightCount+1];

        for(int i=0; i<leftCount;i++){
            left[i] = a[start+i];
        }

        for(int j=0; j<rightCount; j++) {
            right[j] = a[mid+j+1];
        }

        left[leftCount] = Integer.MAX_VALUE;
        right[rightCount] = Integer.MAX_VALUE;

        int leftIndex=0;
        int rightIndex=0;

        for(int k=start; k<=end; k++) {

            if ( left[leftIndex] < right[rightIndex] ) {
                a[k] = left[leftIndex];
                leftIndex++;
            } else {
                a[k] = right[rightIndex];
                rightIndex++;
            }
        }
        //System.out.println(Arrays.toString(a));
    }

    public static void main(String [] args) {

        int [] a = new int[]{5,2,4,7,1,3,2,6};

        System.out.println(Arrays.toString(a));
        mergeSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
