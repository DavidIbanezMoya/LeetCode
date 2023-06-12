package BegginerExercices;

/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.*/

import java.util.ArrayList;


public class RansomNote {

    public static void main(String[] args) {

        System.out.println(canConstruct("aa","ab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        //Verify that they are at LowerCase
        ransomNote = ransomNote.toLowerCase();
        magazine = magazine.toLowerCase();

        //Should use a counter of characters to make that the order doesnt matter
        ArrayList<Character> ransomNoteString = new ArrayList<>();
        ArrayList<Character> magazineString = new ArrayList<>();


        //Add individual character to the AList
        for (int i = 0; i < ransomNote.length(); i++) {
            ransomNoteString.add(ransomNote.charAt(i));
        }
        for (int i = 0; i < magazine.length(); i++) {
            magazineString.add(magazine.charAt(i));
        }

        //Verify characters
        for (int i = 0; i < ransomNoteString.size(); i++) {
            Boolean isPresent = false;

            for (int j = 0; j < magazineString.size(); j++) {
                if (ransomNoteString.get(i) == magazineString.get(j)) {
                    isPresent = true;
                    magazineString.remove(j);
                    break;
                }
            }
            if (!isPresent) {
                return false;
            }

        }
        return true;
    }
}
