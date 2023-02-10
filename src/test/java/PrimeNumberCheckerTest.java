import PrimeNumber.PrimeNumberChecker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeNumberCheckerTest {

    @Test
    public void testFiveIsPrimeNumber() {
        assertEquals(true, PrimeNumberChecker.isPrime(5));
    }

    @Test
    public void testSixIsPrimeNumber() {
        assertEquals(false, PrimeNumberChecker.isPrime(6));
    }

    @Test
    public void testAnotherIsPrimeNumber() {
        assertEquals(true, PrimeNumberChecker.isPrime(17));
    }

    @Test
    public void testAnotherIsNotPrimeNumber() {
        assertEquals(false, PrimeNumberChecker.isPrime(39));
    }



}
