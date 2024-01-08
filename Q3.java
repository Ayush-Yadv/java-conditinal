
/*
 * 3. Write a Java program that takes three numbers from the user and prints the greatest number.

Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87

 */
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int max = Math.max(num1, Math.max(num2, num3));
        System.out.println(max);
    }
}
