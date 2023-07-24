package Top100.Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinations {
    private HashMap<String, String> numbers;

    public LetterCombinations() {
        numbers = new HashMap<>();
        numbers.put("2", "abc");
        numbers.put("3", "def");
        numbers.put("4", "ghi");
        numbers.put("5", "jkl");
        numbers.put("6", "mno");
        numbers.put("7", "pqrs");
        numbers.put("8", "tuv");
        numbers.put("9", "wxyz");
    }

    public static void main(String[] args) {
        LetterCombinations lc = new LetterCombinations();
        System.out.println(lc.letterCombinations("23"));
    }

    public List<String> letterCombinations(String digits) {

        ArrayList<String> combinations = new ArrayList<>();

        //Need to check that there are only correct numbers
        if (digits.isEmpty()) {
            System.out.println("Empty number");
            return null;
        }

        //for (int i = 0; i < digits.length(); i++) {
            numberLetter(digits,0,combinations,0,"");
        //}
        return combinations;
    }

    /*private char numberLetter (String number, int position, ArrayList combinations, int currentPosition) {
        String currentNumber = String.valueOf(number.charAt(currentPosition));

        //Current position is the position of the letter in the hashmap
        //Position is the number selected

        //Every time I have to call the following position and call the new method
        //System.out.println(numbers.get(number).charAt(currentPosition).length());
        if (position >= numbers.get(currentNumber).length()) {
            if (currentPosition+1 >= number.length()) {
                return ' ';
            }
            return numberLetter(number,0,combinations,currentPosition+1);
        }
        else {
            combinations.add(numbers.get(currentNumber).charAt(position));
            return numberLetter(number,position+1,combinations,currentPosition);
        }
    }*/

    private ArrayList numberLetter (String number, int nDigit, ArrayList combinations, int nLetter, String text) {

        //Final check
        if (nDigit >= number.length()) {
            //We get the last element of the Numbers, to check how many characters will have into the hashmap
            //Later on we will end the function

            if (nLetter >= numbers.get(String.valueOf(number.charAt(number.length()-1))).length()) {
                return combinations;
            }
        } else {
            //todo Verify to dont nothing empty if there's no info

            //todo CHANGE NDIGIT NO NLETTER
            combinations.add(text);
            if (nLetter >= numbers.get(String.valueOf(number.charAt(nDigit))).length()) {
                return numberLetter(number,0,combinations,nLetter+1,"");
            }
            text += numbers.get(String.valueOf(number.charAt(nDigit))).charAt(nLetter);

        }
        return numberLetter(number,nDigit+1,combinations,nLetter,text+"");


    }
}
