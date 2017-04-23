class ReverseVowels {


    public static String reverseVowels(String a) {

        char [] reversed = a.toCharArray();

        int vowelFromLeft = getNextVowelLeft(-1,a);
        int vowelFromRight = getNextVowelRight(a.length(),a);

        while(vowelFromLeft < vowelFromRight) {

            char tmp = reversed[vowelFromLeft];
            reversed[vowelFromLeft] = reversed[vowelFromRight];
            reversed[vowelFromRight] = tmp;

            vowelFromLeft = getNextVowelLeft(vowelFromLeft,a);
            vowelFromRight = getNextVowelRight(vowelFromRight,a);
        }

        return String.valueOf(reversed);
    }

    public static int getNextVowelRight(int index, String a) {

        for(int i=--index; i>=0; i--) {

            char c = a.charAt(i);

            if (isVowel(c))
                return i;
        }

        return Integer.MIN_VALUE;
    }

    public static int getNextVowelLeft(int index, String a) {

        for(int i=++index; i<a.length()-1; i++) {

            char c = a.charAt(i);

            if (isVowel(c))
                return i;
        }

        return Integer.MAX_VALUE;
    }

    public static boolean isVowel(char c) {

        c = Character.toLowerCase(c);

        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }

    public static void main(String [] args) {

        // "a" -> a
        // "aeio" -> "oiea"
        // "aeiou" -> "uoiea"
        // "b" -> b
        // "bcd" -> "bcd"

        // abcde -> ebcda
        // aeighj -> ieaghj
        System.out.println(reverseVowels("aeio"));
    }

}
