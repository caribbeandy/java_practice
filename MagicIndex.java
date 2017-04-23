class MagicIndex {


    public static void main(String [] args) {

        int [] a = new int[]{-1,0,1,2,3,5,6,7,8};
        int [] b = new int[]{-1,0,1,2,3,5,6,7,8};

        System.out.println(magicIndex(a, 0, a.length-1));
    }
    
    public static boolean magicIndex(int [] a, int start, int end) {

        if (start>end)
            return false;

        int mid = (start+end)/2;

        if (a[mid]==mid) {
            return true;
        } else if (a[mid]>mid) {
            return magicIndex(a, start, mid-1);
        } else {
            return magicIndex(a, mid+1, end);
        }
    }

    public static boolean magicIndex2(int [] a, int start, int end) {
    
        if (start>end)
            return false;

        int mid = (start+end)/2;

        if (a[mid]==mid) {
            return true;
        } else if (a[mid]>mid) {
            return magicIndex(a, start, mid-1);
        } else {
            return magicIndex(a, mid+1, end);
        }

    }
}
