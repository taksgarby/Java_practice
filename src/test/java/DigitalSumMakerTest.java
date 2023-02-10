import DigitalSum.DigitalSumMaker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitalSumMakerTest {

    @Test
    public void makesDigitalSum() {
        assertEquals(5, DigitalSumMaker.digitalSum(653));
    }

}
