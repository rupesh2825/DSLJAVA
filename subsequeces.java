import java.util.Scanner;

public class array {
    public static void subsequences(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        subsequences(str, idx + 1, newString + currChar);

        subsequences(str, idx + 1, newString);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            subsequences(str, 0, "");
        }
    }
}
