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

        // Need to check that there are only correct numbers
        if (digits.isEmpty()) {
            System.out.println("Empty number");
            return combinations;
        }

        numberLetter(digits, 0, combinations, "");
        return combinations;
    }

    private void numberLetter(String number, int nDigit, ArrayList<String> combinations, String text) {
        // Base case: If the current digit index is greater than or equal to the length of the number
        if (nDigit >= number.length()) {
            // Add the final combination to the list
            combinations.add(text);
        } else {
            // Get the corresponding letters for the current digit
            String letters = numbers.get(String.valueOf(number.charAt(nDigit)));
            // Recursively explore all combinations by appending each letter to the text
            //Will check every number
            for (int i = 0; i < letters.length(); i++) {
                numberLetter(number, nDigit + 1, combinations, text + letters.charAt(i));
            }
        }
    }


}
