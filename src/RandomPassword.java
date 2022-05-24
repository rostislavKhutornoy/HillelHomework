public class RandomPassword {
    public String password;

    private char getNumber() {
        return (char)(int) (Math.random() * 10 + 48);
    }

    private char getUpperLetter() {
        char letter;
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int random = (int) (Math.random() * 26);
        letter = letters.charAt(random);
        return letter;
    }

    private char getLowerLetter() {
        char letter;
        String letters = "abcdefghijklmnopqrstuvwxyz";
        int random = (int) (Math.random() * 26);
        letter = letters.charAt(random);
        return letter;
    }

    private String getPassword() {
        int n = 8;
        char[] passwordArray = new char[n];
        int underline = 0;
        while (true) {
            boolean num = false;
            boolean upperL = false;
            boolean lowerL = false;
            for (int i = 0; i < n; i++) {
                int randomSymbol = (int) (Math.random() * 4);
                if (randomSymbol == 0) {
                    passwordArray[i] = getNumber();
                    num = true;
                } else if (randomSymbol == 1) {
                    passwordArray[i] = getUpperLetter();
                    upperL = true;
                } else if (randomSymbol == 2) {
                    passwordArray[i] = getLowerLetter();
                    lowerL = true;
                } else {
                    underline++;
                    if (underline <= 2) {
                        passwordArray[i] = '_';
                    } else passwordArray[i] = getNumber();
                }
            }
            if(num && upperL && lowerL) {
                break;
            }
        }
        password = new String(passwordArray);
        return password;
    }

    public static void main(String[] args) {
        RandomPassword pass = new RandomPassword();
        // Массив 5 на 5 со случаными паролями для наглядного примера
        String[][] Password = new String[5][5];
        for (int i = 0; i < Password.length; i++) {
            for (int j = 0; j < Password[i].length; j++) {
                Password[i][j] = pass.getPassword();
                System.out.print(Password[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
