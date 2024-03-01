import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // decalre array of 10 int
        String possibleColors [] =  {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        String solution = "red";

        // print the list of colors
        System.out.println("Pick a color from the list: black, brown, red, orange, yellow, green, blue, violet, grey, white");

        while (true) {

            // get user input
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            // check if the input is correct (ignore case)
            if (input.toLowerCase().equals(solution)) {
                System.out.println("You are correct");
                break;
            } else {
                System.out.println("Wrong color please try again");
            }
        }
    }
}