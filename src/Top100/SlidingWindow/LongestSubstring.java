package Top100.SlidingWindow;

//Given a string s, find the length of the longest
//substring
// without repeating characters.

import java.util.ArrayList;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        int length = 1;
        int maxLength = length;

        int n = 0;
        String currentWord = "";

        //Use a while to move the widnow
        while (n <= s.length()-1) {
            if (currentWord.contains(s.substring(n,n+1))) {
                if (length > maxLength) maxLength = length;

                //Check the position where the first character is to start from there +1
                if (currentWord.length() >= 1) {
                    currentWord += s.substring(n,n+1);
                    currentWord = currentWord.substring(currentWord.indexOf(s.substring(n,n+1))+1);

                } else {
                    currentWord = "";
                }
                length = currentWord.length();
                n++;
            }
            else {
                //Adding a new char to the word
                currentWord += s.substring(n,n+1);
                if (n >= 1) length++;
                n++;
            }
        }

        if (length > maxLength) maxLength = length;
        return maxLength;
    };
}
