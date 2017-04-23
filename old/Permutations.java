public class Permutations {
    static int count=0;

    static void permutations(String str, String prefix){

        if (str.length()==0){
            System.out.println(prefix);
        }

        else{
            for(int i=0;i<str.length();i++){
                count++;
                String rem = str.substring(0,i) + str.substring(i+1);
                permutations(rem, prefix+str.charAt(i));
            }
        }

    }
    public static void main(String[] args) {
        permutations("abcd", "");
        System.out.println(count);
    }

}
