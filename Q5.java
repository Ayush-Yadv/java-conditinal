
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 7: ");
        int num = in.nextInt();

        // Generate a random number between 1 and 7
        int randomNum = (int) (Math.random() * 7) + 1;

        // Assign weekday names based on the generated random number
        String dayName;
        switch (randomNum) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid input";
                break;
        }

        // Display the randomly generated weekday name
        System.out.println("Random weekday for the number " + randomNum + " is: " + dayName);
    }
}
