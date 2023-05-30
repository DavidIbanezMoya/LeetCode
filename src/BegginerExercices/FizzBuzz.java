package BegginerExercices;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    /*Given an integer n, return a string array answer (1-indexed) where:

    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    answer[i] == "Fizz" if i is divisible by 3.
    answer[i] == "Buzz" if i is divisible by 5.
    answer[i] == i (as a string) if none of the above conditions are true.*/
    public static void main(String[] args) {
        FizzBuzz obj = new FizzBuzz();
        List<String> response = obj.fizzBuzz(15);
        System.out.println(response);
    }

    public List<String> fizzBuzz(int n) {
        List<String> stringList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i%15 == 0) {
                stringList.add("FizzBuzz");
            } else if (i%3 == 0) {
                stringList.add("Fizz");
            } else if (i%5 == 0 ) {
                stringList.add("Buzz");
            } else {
                stringList.add(String.valueOf(i));
            }

        }
        return stringList;
    }
}
