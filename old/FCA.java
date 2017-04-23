class FCA {

    public static Node firstAncestor(Node a, Node b) {

        int aHeight = getHeight(a);
        int bHeight = getHeight(b);

        Node longer;
        Node shorter;

        int numIter = Math.abs(aHeight-bHeight);

        if ( aHeight < bHeight ) {
            shorter = aHeight;
            longer = bHeight;
        } else {
            shorter = bHeight;
            longer = aHeight;
        }

        int i=0;
        while(i<numIter) {
            longer=longer.parent;
            i++;
        }

        while(shorter!=null) {

            if ( shorter == longer ) return true;

            shorter=shorter.parent;
            longer=longer.parent;
        }

        return false;
    }

    public static int height(Node n) {

        int i=0;

        while(n!=null) {
            i++;
            n=n.parent;
        }

        return i;
    }

// todo implement
    public static int getHeight(Node n) {

    }


}
