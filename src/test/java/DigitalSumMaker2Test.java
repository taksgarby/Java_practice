import DigitalSum.DigitalSumMaker2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitalSumMaker2Test {

    @Test
    public void makesDigitalSum2() {
        assertEquals(2, DigitalSumMaker2.digitalSum(695));
        assertEquals(6, DigitalSumMaker2.digitalSum(6));
    }

}
