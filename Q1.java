
/*
 1. Write a Java program to get a number from the user and print whether it is positive or negative.

Test Data
Input number: 35
Expected Output :
Number is positive

 */
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("plse inter any value ");
        int num1 = in.nextInt();
        if (num1 > -1) {
            System.out.println("number is postive");
        } else {
            System.out.println("number is negative");
        }
    }
}