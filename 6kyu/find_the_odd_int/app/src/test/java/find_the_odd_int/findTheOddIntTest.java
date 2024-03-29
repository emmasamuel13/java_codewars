/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package find_the_odd_int;

import org.junit.Test;
import static org.junit.Assert.*;

public class findTheOddIntTest {
    @Test public void returns5() {
        findTheOddInt testClass = new findTheOddInt();
        assertEquals("returns 5", Integer.valueOf(5), testClass.findOdd(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
    }

    @Test public void returnsNeg1() {
        findTheOddInt testClass = new findTheOddInt();
        assertEquals("returns -1", Integer.valueOf(-1), testClass.findOdd(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
    }

    @Test public void returns10() {
        findTheOddInt testClass = new findTheOddInt();
        assertEquals("returns 10", Integer.valueOf(10), testClass.findOdd(new int[]{10}));
    }

    @Test public void returns10Again() {
        findTheOddInt testClass = new findTheOddInt();
        assertEquals("returns 10", Integer.valueOf(10), testClass.findOdd(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
    }
}
