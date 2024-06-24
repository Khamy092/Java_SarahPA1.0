package input;

import java.util.Scanner;

public class TextInputHandler {

    /**
     * This method takes in user input
     * 
     * @return input the user input
     */

    public String takeInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }


    /**
     * This method processes the user input
     * 
     * @param input the user input
     * @return the processed input
     */

    // proccessInput method
    public String processInput(String input) {

        
        // converts input to lowercase
        input = input.toLowerCase();

        // checks if input is empty
        if (input.isEmpty()) {
            return "Cannot process empty input. Please try again.";
        }

        // checks if input has special characters
        if (input.matches(".*[!@#$%^&*()_+=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
            return "Input cannot contain special characters. Please try again.";
        }

        // checks if input has numbers
        if (input.matches(".*\\d.*")) {
            return "Input cannot contain numbers. Please try again.";
        }

        // checks if input has symbols
        if (input.matches(".*[a-zA-Z].*")) {
            return "Input cannot contain symbols. Please try again.";
        }

        // checks if input has spaces
        if (input.matches(".*\\s.*")) {
            return "Input cannot contain spaces. Please try again.";
        }

        return input;
    }
}