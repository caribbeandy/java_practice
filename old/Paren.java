import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

class Paren {

    static int count = 50;

    public static Set<String> generateParens(int remaining) {

        Set<String> set = new HashSet<String>();

        // Base case
        if (remaining==0){
            set.add("");
        } else {

            Set<String> prev = generateParens(remaining-1);

            for(String str: prev) {

                for(int i=0; i<str.length(); i++) {
                    if (str.charAt(i) == '(') {
                        String s = insertInside(str,i);
                        set.add(s);
                    }
                }

                set.add("()" + str);
            }
        }

        return set;
    }

    // char[]str holds candidates
    public static void addParen(ArrayList<String> list, int leftRem, int rightRem, char [] str, int index) {

        // invalid conditions
        if (leftRem < 0 || rightRem < leftRem) {

            if (rightRem < leftRem) {
            }

            return;
        }

        if (leftRem == 0 && rightRem==0) {

            // no more left or right par to add, we're done. add it to the results array
            list.add(String.copyValueOf(str));
        } else {

            // try with a left parentheses
            str[index] = '(';
            addParen(list, leftRem-1,rightRem,str,index+1);

            // replace current index with a right parentheses
            str[index] = ')';
            addParen(list,leftRem,rightRem-1,str,index+1);
        }
    }

    public static ArrayList<String> genPar(int count){

        // init character array to hold twice the amount of the count
        // why char array though?
        char [] str = new char[count*2];

        // list that holds the results
        ArrayList<String> list = new ArrayList<String>();

        // seed with the current count
        // what's index?
        addParen(list, count, count, str, 0);
        return list;
    }

    public static String insertInside(String str, int leftIndex) {
        String left = str.substring(0, leftIndex+1);
        String right = str.substring(leftIndex+1, str.length());
        return left + "()" + right;
    }

    public static void main(String [] args) {
        System.out.println(genPar(1).toString());
    }
}
