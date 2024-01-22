package string;
import java.util.*;

public class name {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of Array : ");
            int size = sc.nextInt();
            System.out.print("Enter the numbers in array : ");
            int number[] = new int[size];

            for (int i = 0; i < size; i++) {
                number[i] = sc.nextInt();
            }

            // Corrected loop to print each element of the array
            for (int i = 0; i < size; i++) {
                System.out.print(number[i]);
                System.out.print(" ");
            }
        }
    }
}
