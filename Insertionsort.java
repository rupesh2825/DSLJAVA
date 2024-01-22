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
        for (int i = 0; i < number.length; i++) {
           int current=number[i];
           int j=i-1;
           while (j>=0&&current<number[j]) {
            number[j+1]=number[i];
            j--;
           }
           number[j+1]=current;
        }
        System.out.println("Sorted array :");
        for (int i = 0; i < size; i++) {
            System.out.print(number[i]);
            System.out.print(" ");
        }

    }

}
