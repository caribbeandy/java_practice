import java.util.Arrays;

class MergeSortTwo {

    public static void sort(int [] a, int start, int end) {

        if (start == end) return;

        int mid = (start+end)/2;
        sort(a, start,mid);
        sort(a,mid+1,end);
        merge(a, start, mid, end);
    }

    public static void merge(int [] a, int start, int mid, int end) {

        int [] left = new int[mid-start+2];
        int [] right = new int[end-mid+1];

        for(int i=0; i<left.length-1; i++) {
            left[i] = a[start+i];
        }

        for(int i=0; i<right.length-1; i++) {
            right[i] = a[mid+i+1];
        }

        left[left.length-1] = Integer.MAX_VALUE;
        right[right.length-1] = Integer.MAX_VALUE;

        int leftIterator=0;
        int rightIterator=0;

        for(int i=start; i<=end; i++) {
            
            int smaller;

            if ( left[leftIterator] < right[rightIterator]) {
                smaller = left[leftIterator];     
                leftIterator++;
            } else {
                smaller = right[rightIterator];
                rightIterator++;
            }

            a[i] = smaller;
        }

    }

    public static void sort(int [] a) {
        sort(a, 0, a.length-1);
    }

    public static void main(String [] args) {

        int [] a = new int[]{};
        sort(a, 0, a.length-1);

        System.out.println(Arrays.toString(a));
    }

}
