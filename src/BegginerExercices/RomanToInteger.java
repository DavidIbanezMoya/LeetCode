package BegginerExercices;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//13 Roman To Integer.
//Given a roman numeral, convert it to an integer.
public class RomanToInteger {

    public static void main(String[] args) {
        RomanToInteger roman = new RomanToInteger();

        Integer finalNumber = roman.romanToInt("MCMXCIV");
        System.out.println(finalNumber);

    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I',1);
        values.put('V',5);
        values.put('X',10);
        values.put('L',50);
        values.put('C',100);
        values.put('D',500);
        values.put('M',1000);
        Integer number = 0;
        Integer sameChar = 0;
        if (s.isEmpty() || s.length() > 15) {
            System.out.println("String size it's not correct");
            return 0;
        } else {
            //Making the letters to UpperCase
            char[] charArray = s.toUpperCase().toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (!values.containsKey(charArray[i])) {
                    System.out.println("This cannot be converted into a Roman Number");
                    return 0;
                } else {
                    if (i+1 < charArray.length) {
                        if (charArray[i] == charArray[i+1]) {
                            sameChar += 1;
                            if (sameChar == 3) {
                                System.out.println("A number can't be repeated 3 times");
                                return 0;
                            }
                        } else {
                            sameChar = 0;
                        }
                        if (values.get(charArray[i]) < values.get(charArray[i+1])) {
                            number -= values.get(charArray[i]);
                        } else {
                            number += values.get(charArray[i]);
                        }
                    } else {
                        number += values.get(charArray[i]);

                    }
                }
            }
        }
        return number;
    }
}