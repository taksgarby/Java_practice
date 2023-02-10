package DigitalSum;

public class DigitalSumMaker2 {

    public static int digitalSum(int number) {
        while (number > 9) {
            number = number/10 + number %10;
        }

        return number;
    }

}
