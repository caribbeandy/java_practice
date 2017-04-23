import java.util.*;
class AnagramComparator implements Comparator<String> {


    public String sortChars(String s) {

        char[] content = s.toCharArray();

        Arrays.sort(content);
        return new String(content);
    }

    public int compare (String s1, String s2) {
        return sortChars(s1).compareTo(sortChars(s2));
    }
    
    public static void main(String [] args) {

        String [] array = new String[]{"cba", "dfe", "rfe", "red", "asdasdk", "abc"};

        for(String s: array) {
            System.out.print(s + " ");
        }
            System.out.println();
        Arrays.sort(array, new AnagramComparator());

        for(String s: array) {
            System.out.print(s + " ");
        }
    }
}
