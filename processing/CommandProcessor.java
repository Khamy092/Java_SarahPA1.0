package processing;


public class CommandProcessor {

    // Array of supported commands
    private
    String[] supportedCommands = {"greeting", "farewall", "help"};

    String command = "";





    // Method to parse the command
    public String parseCommand(String input) {

        if (input == "hey" || input == "hello" || input == "hi") {

            command = "greeting";
            return command;

        } else if (input == "bye" || input == "goodbye") {

            command = "farewell";
            return command;

        } else if (input == "help") {
            
            command = "help";
            return command;

        } else {
            
            command = "unknown";
            return command;
        }
    }
}
