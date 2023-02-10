package ReverseString;

public class ReverseStringMaker {

    public static String reverseString(String word) {

        String temporary = "";

        for (int i = 0; i < word.length(); i++) {
            temporary= word.charAt(i) + temporary;
        }
        return temporary;
    }

}
