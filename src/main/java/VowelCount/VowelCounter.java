package VowelCount;
import java.io.*;

public class VowelCounter {

    public static int vowelCount(String word) {
//        make all the letters lowercase
        word = word.toLowerCase();
//        set up a vowel count variable
        int counter = 0;

        for (int i =0; i < word.length(); i ++) {
//            check if char[i] is a vowel
//            make sure to use single quotes, not double quotes!
            if (word.charAt(i) == 'a'
                    || word.charAt(i) == 'i'
                    || word.charAt(i) == 'u'
                    || word.charAt(i) == 'e'
                    || word.charAt(i) == 'o') {
                    counter ++;
            }
        }
        return counter;
    }

}
