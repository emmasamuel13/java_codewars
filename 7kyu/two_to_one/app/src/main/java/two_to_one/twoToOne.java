/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package two_to_one;

import java.util.ArrayList;
import java.util.Arrays;

public class twoToOne {

    public String rearrangeStrings(String firstString, String secondString) {
        String combinedStrings = firstString + secondString;
        String letterString = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<String> noDupsArray = new ArrayList<String>();
        String[] characterArray = combinedStrings.split("");
        String[] letterArray = letterString.split("");
        Arrays.sort(characterArray);
        for (int element = 0; element < characterArray.length; element++) {
            if (!noDupsArray.contains(characterArray[element]) && Arrays.asList(letterArray).contains(characterArray[element])) {
                noDupsArray.add(characterArray[element]);
            }
        }
        return String.join("", noDupsArray);
    }
}