class OddManOut {

    static int oddManOut(int [] a){
        int val = 0;

        for(int i=0; i<a.length;i++){
            val ^= a[i];
        }

        return val;
    }


    public static void main(String [] args) {
        //System.out.println(oddManOut(new int[]{2,6,6,2,4,4,5}));

    }

}
