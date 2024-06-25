package input;

import java.util.Scanner;

public class InputHandler {

    /**
     * This method takes in user input
     * 
     * @return input the user input
     */

    public String takeInput() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        return userInput;
    }

    /**
     * This method processes the user input
     * 
     * @param input the user input
     * @return the processed input
     */

    // proccessInput method
    public String validateUserInput(String userInput) {

        
        // converts input to lowercase
        userInput = userInput.toLowerCase();

        // checks if input is empty
        if (userInput.isEmpty()) {
            return "Cannot process empty input. Please try again.";
        }

        // checks if input has special characters
        if (userInput.matches(".*[!@#$%^&*()_+=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
            return "Input cannot contain special characters. Please try again.";
        }

        // checks if input has numbers
        if (userInput.matches(".*\\d.*")) {
            return "Input cannot contain numbers. Please try again.";
        }

        // checks if input has symbols
        if (userInput.matches(".*[a-zA-Z].*")) {
            return "Input cannot contain symbols. Please try again.";
        }

        // checks if input has spaces
        if (userInput.matches(".*\\s.*")) {
            return "Input cannot contain spaces. Please try again.";
        }

        return userInput;
    }
}