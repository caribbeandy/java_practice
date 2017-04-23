import java.util.*;
import java.util.ArrayList;

class SortAnagram {

    public static void main(String [] args) {

        String [] s = new String[]{"abc", "def", "cba", "cb", "a", "fed"};
        sort(s);
        System.out.println(Arrays.toString(s));

    }


    public static void sort(String [] stringArray) {

        if ( stringArray.length <=1 ) return;

        HashMap<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        List<Integer> list;

        // Add each string to the hashmap
        for(int i=0; i<stringArray.length; i++) {

            char [] s = stringArray[i].toCharArray();
            Arrays.sort(s);
            String sortedString = String.valueOf(s);
            
            if ( !map.containsKey(sortedString) ) {
                list = new ArrayList<Integer>();
            } else {
               list = map.get(sortedString);
            }

            list.add(i);
            map.put(sortedString, list); 
        }

        String [] newArray = new String[stringArray.length];

        int currIndex = 0;
        for(String key: map.keySet()) {

            list = map.get(key);

            for(int j=0; j<list.size(); j++) {
               newArray[currIndex++] = stringArray[list.get(j)]; 
            }
        }

        for(int i=0; i<stringArray.length; i++) {
            stringArray[i] = newArray[i];
        }

    }

}

    
