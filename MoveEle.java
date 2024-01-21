import java.util.Scanner;

public class array {
    public static void moveAllX(String str, int idx, int count, StringBuilder newString, char ele) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString.append(ele); // Fix: Use append method instead of +=
            }
            System.out.println(newString.toString());
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == ele) {
            count++;
            moveAllX(str, idx + 1, count, newString, ele);
        } else {
            newString.append(currChar);
            moveAllX(str, idx + 1, count, newString, ele);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            char ele = sc.next().charAt(0); // Fix: Use charAt(0) to get the first character
            moveAllX(str, 0, 0, new StringBuilder(), ele); // Fix: Use StringBuilder for better performance
        }
    }
}
