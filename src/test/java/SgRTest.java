import junit.framework.TestCase;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SgRTest extends TestCase {
    @Test public void test4a() {
        assertEquals("aaaa", SgR.repeatStr(4, "a"));
    }
    @Test public void test3Hello() {
        assertEquals("HelloHelloHello", SgR.repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        assertEquals("", SgR.repeatStr(5, ""));
    }
    @Test public void test0kata() {
        assertEquals("", SgR.repeatStr(0, "kata"));
    }
}