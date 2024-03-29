/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package digital_root;

import org.junit.Test;
import static org.junit.Assert.*;

public class DigitalRootTest {
    @Test public void addsdigits16() {
        DigitalRoot classUnderTest = new DigitalRoot();
        assertEquals("adds digits 16 to get 7", Integer.valueOf(7), classUnderTest.digital_root(16));
    }

    @Test public void addsdigits942() {
        DigitalRoot classUnderTest = new DigitalRoot();
        assertEquals("adds digits 942 to get 6", Integer.valueOf(6), classUnderTest.digital_root(942));
    }

    @Test public void addsdigits132189() {
        DigitalRoot classUnderTest = new DigitalRoot();
        assertEquals("adds digits 132189 to get 6", Integer.valueOf(6), classUnderTest.digital_root(132189));
    }

    @Test public void addsdigits493193() {
        DigitalRoot classUnderTest = new DigitalRoot();
        assertEquals("adds digits 493193 to get 2", Integer.valueOf(2), classUnderTest.digital_root(493193));
    }
}
