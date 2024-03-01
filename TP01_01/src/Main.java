import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // check if the number is even or odd
        int number = 0;

        System.out.println("Enter a number: ");

        // Get the number from the user
        Scanner my_scanner = new Scanner(System.in);
        number = my_scanner.nextInt();

        if (number == 0) {
            System.out.println("The number is zero.");
        } else if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }


    }
}