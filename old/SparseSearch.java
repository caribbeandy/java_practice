class SparseSearch {

    public static void main(String [] args) {

        String [] s = new String[]{"at", "", "","","ball","","","car","","","dad","",""};
        System.out.println(search(s, "ball",0,s.length-1));

    }

    public static int search(String [] s, String needle, int start, int end) {

        // base case
        if (end < start) {
            return -1;
        }

        int mid = (start+end)/2;

        // we're done
        if ( s[mid].equals(needle) ) {
            return mid;

            // On the left
        } else {
            int onTheLeft = onTheLeft(s,needle,start,mid,end);
            System.out.println(mid + " " + onTheLeft);
            if ( onTheLeft == 1 ) {
                return search(s,needle,start,mid-1);

                // On the right
            } else if (onTheLeft == -1) {
                return search(s,needle,mid+1,end);
            } else {
                return -1;
            }
        }

    }

    public static int onTheLeft(String [] s, String needle, int start,int mid, int end) {

        // check left
        int i = 1;

        for(; i<=mid-start; i++){

            if ( (mid-i>=0) && !s[mid-i].equals("") ) {
                if ( s[mid-i].compareTo(needle) < 0 ) {
                    return -1;
                } else {
                    return 1;
                }
            }

            if ( (mid+i <= end) && !s[mid+i].equals("") ) {

                if ( s[mid+i].compareTo(needle) < 1 ) {
                    return -1;
                } else {
                    return 1;
                }
            }

        }

        return 0;
    }
}

