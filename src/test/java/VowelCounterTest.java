import VowelCount.VowelCounter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelCounterTest {

    @Test
    public void testCountVowel() {
        assertEquals(2, VowelCounter.vowelCount("Choco"));
    }


    @Test
    public void testCountVowel_None() {
        assertEquals(0, VowelCounter.vowelCount("Dryly"));
    }
}
