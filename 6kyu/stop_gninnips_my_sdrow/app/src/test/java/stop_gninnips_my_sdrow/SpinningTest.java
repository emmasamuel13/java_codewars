/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package main.java.stop_gninnips_my_sdrow;

import org.junit.Test;
import static org.junit.Assert.*;

public class SpinningTest {
    @Test public void singleWord() {
        Spinning testClass = new Spinning();
        assertEquals("should reverse the word", String.valueOf("emocleW"), testClass.spinTheWords("Welcome"));
    }

    @Test public void multipleWords() {
        Spinning testClass = new Spinning();
        assertEquals("should reverse all words over 5 letters", String.valueOf("Hey wollef sroirraw"), testClass.spinTheWords("Hey fellow warriors"));
    }
}
