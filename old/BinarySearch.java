class BinarySearch{




    public static int search (int [] a, int val) {
        return search(a, val, 0, a.length-1);
    }

    public static int search(int [] a, int val, int start, int end) {

        if (end < start) return -1;

        int mid = (start+end)/2;
        int midVal = a[mid];

        if ( midVal == val ) {
            return mid;
        } else if ( midVal < val) {
            return search(a,val,mid+1,end);
        } else {
            return search(a,val,start,mid-1);
        }
    }

    public static void main(String [] args) {

        System.out.println(search(new int[]{1,2,3,4,5,6,7}, 1));

    }

}
