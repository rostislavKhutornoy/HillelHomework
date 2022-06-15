package Task22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderDouble {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static double GetDouble() throws IOException {
        double value;
        while (true) {
            try {
                System.out.print("Enter: ");
                value = Double.parseDouble(READER.readLine());
                break;
            } catch (Exception exception) {
                System.out.println("Unexpected value. Try again.");
            }
        }
        return value;
    }
}
