import java.util.ArrayList;

class P {


    public static ArrayList<String> getPerms(String str) {
        
        if (str==null) return null;

        ArrayList<String> perms = new ArrayList<String>();

        if (str.length() ==0) {
            perms.add("");
            return perms;
        }

        char first = str.charAt(0);

        String remainder = str.substring(1);

        ArrayList<String> rem = getPerms(remainder);

        for(String l : rem) {
            for(int j=0; j<=l.length(); j++) {
                String s = insertCharAt(l, first,j);
                perms.add(s);
            }
        }

        return perms;

    }

    public static String insertCharAt(String word, char c, int i) {

        String start = word.substring(0,i);
        String end = word.substring(i);
        return start + c + end;

    }

    public static void main(String [] args) {

        ArrayList<String> l = getPerms("abbccc");

        for(String s: l) {
            System.out.println(s);
        }
    }

}
