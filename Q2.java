
/*
 * 2. Write a Java program to solve quadratic equations (use if, else if and else).

Test Data
Input a: 1
Input b: 5
Input c: 1
Expected Output :
The roots are -0.20871215252208009 and -4.7912878474779195

 */
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("plse provide value for a,b,c");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        float root1 = (-b + ((b ^ 2 - 4 * a * c) ^ 1 / 2)) / 2 * a;
        float root2 = (-b - ((b ^ 2 - 4 * a * c) ^ 1 / 2)) / 2 * a;
        System.out.println("roots are ");
        System.out.println(root1);
        System.out.println(root2);

    }
}
