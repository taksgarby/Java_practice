package ReverseString;

public class Reverse5LetterString {

    public static String reverseFive(String word) {
        String temporary = "";
        int len = word.length();

        if (len < 5) {
            temporary = word;
        }
            else {
                for (int i = 0; i < len; i++) {
                temporary = word.charAt(i) + temporary;
                }
            }
            return temporary;
        }
    }

