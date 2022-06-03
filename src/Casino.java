import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Casino {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private static void FillPlayerTicket(int[] array) throws IOException {
        System.out.println("Please fill in your ticket with numbers: ");
        for (int i = 0; i < array.length; i++) {
            while (true) {
                while (true) {
                    try {
                        array[i] = Integer.parseInt(READER.readLine());
                        break;
                    } catch (Exception exception) {
                        System.out.println("You can enter only number from 0 to 9!");
                    }
                }
                if (array[i] < 0 || array[i] > 9) {
                    System.out.println("Wrong number!");
                } else break;
            }
        }
        Arrays.sort(array);
    }

    private static void FillCasinoTicket(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9);
        }
        Arrays.sort(array);
    }

    private static void SummingUp(int[] casinoTicket, int[] playerTicket) {
        int result = 0;
        for (int i = 0; i < casinoTicket.length; i++) {
            if(casinoTicket[i] == playerTicket[i]) {
                result += 1;
            }
        }
        System.out.println("Winning sequence: \t" + Arrays.toString(casinoTicket));
        System.out.println("Your sequence: \t\t" + Arrays.toString(playerTicket));
        System.out.println("Number of coincidences: " + result + " out of 7");
    }

    public static void PlayCasino() throws IOException {
        int n = 7;
        int[] casinoTicket = new int[n];
        Casino.FillCasinoTicket(casinoTicket);
        int[] playerTicket = new int[n];
        Casino.FillPlayerTicket(playerTicket);
        Casino.SummingUp(casinoTicket, playerTicket);
    }

    public static void main(String[] args) throws IOException {
        PlayCasino();
    }
}
