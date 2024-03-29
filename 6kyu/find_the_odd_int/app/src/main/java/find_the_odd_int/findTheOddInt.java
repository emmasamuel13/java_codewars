/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package find_the_odd_int;

import java.util.Arrays;

public class findTheOddInt {
    public static Integer findOdd(int[] numbers) {
        if (numbers.length == 1) {
            return numbers[0];
        }
        Arrays.sort(numbers);
        int count = 0;
        int oddNumber = 0;
        boolean changed = false;
        for (int element = 0; element < numbers.length; element++) {
            if (element == 0) {
                count++;
            } else if (numbers[element] == numbers[element - 1]) {
                count++;
            } else if (numbers[element] != numbers[element - 1]) {
                if (count % 2 == 0) {
                        count = 1;
                } else {
                    oddNumber = numbers[element - 1];
                    changed = true;
                }
            }
        }
        if (changed == false) {
            oddNumber = numbers[numbers.length - 1];
        }
        return oddNumber;
    }
}
