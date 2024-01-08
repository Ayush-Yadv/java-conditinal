import java.util.Scanner;

/*
 * 7. Write a Java program to find the number of days in a month.

Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days
 */

public class Q7 {
    public static void main(String[] args) {
        System.out.println("enter year");
        System.out.println("enter month ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        int months = input.nextInt();
        if (months <= 7 && months % 2 != 0 && months != 2) {
            System.out.println("months have 31 days");
        } else if (months >= 8 && months <= 12 && months % 2 == 0) {
            System.out.println("months have 31 days");
        } else {
            System.out.println("months have 30 days");
        }
    }
}
