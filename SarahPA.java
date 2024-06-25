import input.*;
import output.*;
import processing.*;


public class SarahPA {

    // Main method

    public void main(String[] args) {
        System.out.println("Welcome to Sarah's Personal Assistant!");
        System.out.println("How can I help you today?");

        // Initialize components
        InputHandler inputHandler = new InputHandler();
        CommandProcessor commandProcessor = new CommandProcessor();
        OutputHandler outputHandler = new OutputHandler();

        // Main loop
        while (true) {

            // Get user input
            String userInput = inputHandler.takeInput();

            // Process user input
            

            // Output result
            
        }
    }
}
