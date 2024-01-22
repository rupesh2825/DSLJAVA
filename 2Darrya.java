package string;
import java.util.*;

public class name {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Entre the numbers of columes :");
        int col = sc.nextInt();

        int[][] number = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(number[i][j]);
                System.out.print(" ");
                if(number[0][col]==number[i][j]||number[1][col]==number[i][j]||number[2][col]==number[i][j]) {
                	System.out.println(number[i][j]);
                }
            }
        }
    }
}
