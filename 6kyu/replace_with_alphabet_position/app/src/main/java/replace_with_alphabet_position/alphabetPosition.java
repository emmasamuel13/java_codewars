/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package replace_with_alphabet_position;

import java.util.ArrayList;
import java.util.Arrays;

public class alphabetPosition {
    public String getNumbers(String inputString) {
        String letterString = "abcdefghijklmnopqrstuvwxyz";
        String[] letterArray = letterString.split("");
        String[] inputArray = inputString.split("");
        ArrayList<String> inputLettersArray = new ArrayList<String>();
        ArrayList<String> numbersArray = new ArrayList<String>();
        for (int element = 0; element < inputArray.length; element++) {
            if (Arrays.asList(letterArray).contains(inputArray[element])) {
                inputLettersArray.add(inputArray[element]);
            }
        }
        for (int element = 0; element < inputLettersArray.size(); element++) {
            switch (inputLettersArray.get(element)) {
                case "a":
                    numbersArray.add("1");
                    break;
                case "b":
                    numbersArray.add("2");
                    break;
                case "c":
                    numbersArray.add("3");
                    break;
                case "d":
                    numbersArray.add("4");
                    break;
                case "e":
                    numbersArray.add("5");
                    break;
                case "f":
                    numbersArray.add("6");
                    break;
                case "g":
                    numbersArray.add("7");
                    break;
                case "h":
                    numbersArray.add("8");
                    break;
                case "i":
                    numbersArray.add("9");
                    break;
                case "j":
                    numbersArray.add("10");
                    break;
                case "k":
                    numbersArray.add("11");
                    break;
                case "l":
                    numbersArray.add("12");
                    break;
                case "m":
                    numbersArray.add("13");
                    break;
                case "n":
                    numbersArray.add("14");
                    break;
                case "o":
                    numbersArray.add("15");
                    break;
                case "p":
                    numbersArray.add("16");
                    break;
                case "q":
                    numbersArray.add("17");
                    break;
                case "r":
                    numbersArray.add("18");
                    break;
                case "s":
                    numbersArray.add("19");
                    break;
                case "t":
                    numbersArray.add("20");
                    break;
                case "u":
                    numbersArray.add("21");
                    break;
                case "v":
                    numbersArray.add("22");
                    break;
                case "w":
                    numbersArray.add("23");
                    break;
                case "x":
                    numbersArray.add("24");
                    break;
                case "y":
                    numbersArray.add("25");
                    break;
                case "z":
                    numbersArray.add("26");
                    break;
            }
        }
        return String.join(", ", numbersArray);
    }
}
