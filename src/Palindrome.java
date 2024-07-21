import java.util.Locale;

public class Palindrome {
    public static boolean isPalindrome(String word){
        word = word.toLowerCase();
        int wordLength = word.length();
        StringBuilder newString = new StringBuilder();
        for(int i = wordLength-1; i >= 0; i--){
            newString.append(word.charAt(i));
        }
        System.out.println(word);
        System.out.println(newString);
        return word.equals(newString.toString());

    }

    public static void main(String[] args) {
        String testWord = "Radar";
        if (isPalindrome(testWord)) {
            System.out.println(testWord + " is a palindrome.");
        } else {
            System.out.println(testWord + " is not a palindrome.");
        }
    }
}
