/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package replace_with_alphabet_position;

import org.junit.Test;
import static org.junit.Assert.*;

public class alphabetPositionTest {
    @Test public void returns1ForA() {
        alphabetPosition testClass = new alphabetPosition();
        assertEquals("should return 1", String.valueOf("1"), testClass.getNumbers("a"));
    }

    @Test public void returns963ForIFC() {
        alphabetPosition testClass = new alphabetPosition();
        assertEquals("should return 9, 6, 3", String.valueOf("9, 6, 3"), testClass.getNumbers("ifc"));
    }

    @Test public void removesSymbols() {
        alphabetPosition testClass = new alphabetPosition();
        assertEquals("should return 1", String.valueOf("1"), testClass.getNumbers("@£a45"));
    }
}