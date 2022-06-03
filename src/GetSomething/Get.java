package GetSomething;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Get {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static int intNumber() throws IOException {
        int number = 0;
        while (true) {
            try {
                number = Integer.parseInt(READER.readLine());
                break;
            } catch (Exception exception) {
                System.out.println("Invalid input, please enter a numeric value.");
            }
        }
        return number;
    }

    public static String string() throws IOException {
        String str;
        while (true) {
            try {
                str = READER.readLine();
                break;
            } catch (Exception exception) {
                System.out.println("Something went wrong, please try again.");
            }
        }
        return str;
    }

    public static double doubleNumber() throws IOException {
        double number = 0;
        while (true) {
            try {
                number = Double.parseDouble(READER.readLine());
                break;
            } catch (Exception exception) {
                System.out.println("Invalid input, please enter a numeric value.");
            }
        }
        return number;
    }
}
