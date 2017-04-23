import java.util.ArrayList;

class T {

    public static ArrayList<String> perms(String str) {

        ArrayList<String> ret = new ArrayList<String>();

        if ( str==null ) {
            return ret;
        }

        if ( str.length()==0 ) {
            ret.add("");
            return ret;
        }

        char first = str.charAt(0);
        String rest = str.substring(1);
        
        ArrayList<String> otherPerms = new ArrayList<String>();
        otherPerms = perms(rest);

        for(String s:otherPerms) {

	       // adds first to a single perm from the previous one
            for(int i=0; i<=s.length(); i++) {
                String perm = insertChar(s,i,first);
                ret.add(perm);
            }
        }

        return ret;
    }

    public static String insertChar(String word, int i, char c) {

        String left = word.substring(0,i);
        String right = word.substring(i);

        return new String(left + c + right);
    }

    public static void main(String [] args) {

        ArrayList<String> list = perms("abcd");

        for(String s: list) {
            System.out.println(s);
        }
    }
}
