import java.util.*;
class Palindrome {

    public static void main(String [] args) {
        System.out.println(isPalindromePermutation("tacocat"));
    }

	public static boolean isPalindromePermutation(String s) {

		HashMap<Character, Integer> map = new HashMap<Character,Integer>();

		for(int i=0; i<s.length(); i++) {
			if ( map.containsKey(s.charAt(i)) ) {
				Integer tmp = map.get(s.charAt(i));
				map.put(s.charAt(i), new Integer(tmp.intValue()+1));
			} else {
				map.put(s.charAt(i),1);
			}
		}

		boolean oddFound = false;

		for(Integer i: map.values()) {
		
			if (i.intValue()%2==1) {
				// Second time encountering an odd count
				if (oddFound) return false;
				else {
					oddFound = true;
				}
			}
		}

		return true;
	}
}
