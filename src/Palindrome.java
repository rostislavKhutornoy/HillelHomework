import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void isPalindrome(String str) {
        boolean isPalinrome = true;
        str = str.replaceAll("\\s","");
        str = str.toLowerCase();
        for (int i = 0, j = str.length() - 1; i <= str.length() / 2 && j >= str.length() / 2; i++, j--) {
            if (!(str.charAt(i) == str.charAt(j))){
                isPalinrome = false;
            }
        }
        if (isPalinrome) {
            System.out.println("You entered a palindrome.");
        } else System.out.println("You entered not a palindrome.");
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Write a word or sentence:");
        String str = READER.readLine();
        isPalindrome(str);
    }
}
