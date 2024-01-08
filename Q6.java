/*
 * . Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.

Test Data
Input floating-point number: 25.586
Input floating-point another number: 25.589
Expected Output :
They are different
 */

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input number in floaating point ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        num1 = Math.round(num1 * 1000);
        num1 = num1 / 1000;
        num2 = Math.round(num2 * 1000);
        num2 = num2 / 1000;
        if (num1 == num2) {
            System.out.println("equal");

        } else {
            System.out.println(" not");
        }

        // if (num1 * 1000 == num2 * 1000) {
        // System.out.println("they are same");

        // } else {
        // System.out.println("they are diffrent");
    }
}
