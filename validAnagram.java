//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

//Input: s = "anagram", t = "nagaram"
//        Output: true

import java.util.Arrays;

public class validAnagram {

    /* function to check whether two strings are
    anagram of each other */
    static boolean validAnagramcheck(String s , String t) {
        char str1[] = s.toCharArray();
        char str2[] = t.toCharArray();
        // Get lengths of both strings
        int n1 = str1.length;
        int n2 = str2.length;

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }
    return true;

    }

    public static void main(String[] args) {
        validAnagramcheck("anagram", "nagaram");

    }
}
