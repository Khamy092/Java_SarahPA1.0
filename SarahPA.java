import input.TextInputHandler;

public class SarahPA {

    // Main method

    public void main(String[] args) {
        System.out.println("Welcome to Sarah's Personal Assistant!");
        System.out.println("How can I help you today?");

        // Create a new TextInputHandler object
        TextInputHandler textHandler = new TextInputHandler();

        // Take user input
        String input = textHandler.takeInput();
        // Process user input
        textHandler.processInput(input);

    }
}
