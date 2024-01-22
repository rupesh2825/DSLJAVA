package string;
public class recarsion1 {

    public static void main(String args[]) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // Print asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Print "x" or last asterisk
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lowerhalf

        for (int i = n; i <= 1; i--) {
            // Print asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Print "x" or last asterisk
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
