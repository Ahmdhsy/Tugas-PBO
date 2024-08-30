import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sampleInput = {
                "-150",
                "150000",
                "1500000000",
                "213333333333333333333333333333333333",
                "-100000000000000"
        };

        int T = sampleInput.length;

        for (int i = 0; i < T; i++) {
            try {
                long n = Long.parseLong(sampleInput[i]);

                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }

            } catch (Exception e) {
                System.out.println(sampleInput[i] + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}
