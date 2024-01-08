
/*
 * 4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, 
 * print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large"
 *  if it exceeds 1,000,000.
Test Data
Input a number: 25
Expected Output :
Input value: 25
Positive number
 */
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please input value");
        float num1 = in.nextInt();
        if (num1 == 0) {
            System.out.println(num1);
        }
        if (num1 > 0) {
            System.out.println("positive" + num1);
        } else {
            System.out.println("negative" + num1);
        }
    }
}
