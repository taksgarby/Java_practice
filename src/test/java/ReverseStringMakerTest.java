import ReverseString.ReverseStringMaker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringMakerTest {

    @Test
    public void testReverseString() {
        assertEquals("yenoH", ReverseStringMaker.reverseString("Honey"));
        assertEquals("puC", ReverseStringMaker.reverseString("Cup"));
    }
}
