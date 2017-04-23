class Compress {


    public static boolean compress(String s) {

        StringBuilder sb = new StringBuilder();

        // todo check base case
        int count = 1;
        for(int i=0; i<s.length(); i++) {
            
            // if it switches, then append the count
            if (i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {
                sb.append(s.charAt(i));
                sb.append(count);
                count = 0;
            }

            count++;
        }

        System.out.println(sb.toString());
        return true;
    }

    public static void main(String [] args) {

       compress("aaabcccdda"); 
    }

}
