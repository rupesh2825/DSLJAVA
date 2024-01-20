package string;
import java.util.*;
public class name{

    public static void towarofHonai(int n, String src, String helper, String dist) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " From " + src + " to " + dist);
            return;
        }

        towarofHonai(n - 1, src, dist, helper);
        System.out.println("Transfer disk " + n + " From " + src + " to " + dist);
        towarofHonai(n - 1, helper, src, dist);

    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String src = "S";
        String helper = "H";
        String dist = "D";
        towarofHonai(n, src, helper, dist);

    }

}
