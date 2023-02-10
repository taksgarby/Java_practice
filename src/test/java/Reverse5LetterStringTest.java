import ReverseString.Reverse5LetterString;
import ReverseString.ReverseStringMaker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Reverse5LetterStringTest {

    @Test
    public void testReverse5Letter() {
        assertEquals("yppaH", Reverse5LetterString.reverseFive("Happy"));
    }

    @Test
    public void testNotReverse() {
        assertEquals("Cup", Reverse5LetterString.reverseFive("Cup"));
    }
}
