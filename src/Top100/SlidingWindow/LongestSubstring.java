package Top100.SlidingWindow;

//Given a string s, find the length of the longest
//substring
// without repeating characters.

import java.util.ArrayList;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int length = 1;
        int maxLength = length;

        int n = 0;
        String currentWord = "";

        ArrayList<String>test = new ArrayList<>();
        //Use a while to move the widnow
        while (n < s.length()-1) {
            if (currentWord.contains(s.substring(n,n+1))) {
                if (length > maxLength) maxLength = length-1;

                //Check the position where the first character is to start from there +1
                if (currentWord.length() > 1) {
                    currentWord += s.substring(n,n+1);

                    //Check where is the letter that we want to remove
                    System.out.println(currentWord.substring(currentWord.indexOf(s.substring(n,n+1))+1));
                    System.out.println(currentWord.split(s.substring(n,n+1))[1]);
                    System.out.println(s.substring(n,n+1));

                    if ( currentWord.split(s.substring(n,n+1))[0].contains(s.substring(n,n+1))) {
                        currentWord = currentWord.split(s.substring(n,n+1))[1];
                        //If the letter is in the first half then we will pick the second one
                    } else {
                        System.out.println(currentWord.split(s.substring(n, n + 1))[0]);
                        //todo Haig de pensar en una forma d'agafar el fragment amb la lletra mes nova

                        currentWord = currentWord.split(s.substring(n, n + 1))[0];
                    }
                } else {
                    currentWord = "";
                }
                length = currentWord.length();
            }
            else {
                currentWord += s.substring(n,n+1);
                length++;
                n++;
            }
        }

        return maxLength;
    };
}
