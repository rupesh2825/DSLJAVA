package string;
import java.util.Scanner;


public class name {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        System.out.print("Enter the numbers in array : ");
        int[] number = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("UnSorted array :");
        for (int i = 0; i < size; i++) {
            System.out.print(number[i]);
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - i - 1; j++) {
                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array :");
        for (int i = 0; i < size; i++) {
            System.out.print(number[i]);
            System.out.print(" ");
        }

    }

}
