class C {


    public static void main(String [] args) {



    }

    public static boolean compressed(String s) {

        String compressed = "";

        int count = 0;

        for(int i=0; i<s.length(); i++) {
            count++;

            if ( i+1>=s.length() || s.charAt(i+1)!=s.charAt(i)  ) {
                compressed += compressed + str.charAt(i) + count;
                count=0;
            }
        }

        return compressed.length() < s.length();
    }

}
