import ReverseString.Reverse5LetterString;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Reverse5LetterStringTest {

    @Test
    public void testReverse5Letter() {
        assertEquals("yppaH", Reverse5LetterString.reverseFive("Happy"));
    }
}
