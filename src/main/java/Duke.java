/**
 * Duke chatbot logic.
 */
public class Duke {
    private String commandType;

    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * Generates a response for the user's chat message.
     */
    public String getResponse(String input) {
        if (input.equalsIgnoreCase("bye")) {
            commandType = "ByeCommand";
            return "Bye. Hope to see you again soon!";
        } else if (input.startsWith("todo") || input.startsWith("deadline") || input.startsWith("event")) {
            commandType = "AddCommand";
            return "Duke added: " + input;
        } else if (input.startsWith("mark") || input.startsWith("unmark")) {
            commandType = "ChangeMarkCommand";
            return "Duke marked/unmarked: " + input;
        } else if (input.startsWith("delete")) {
            commandType = "DeleteCommand";
            return "Duke deleted: " + input;
        } else {
            commandType = "DefaultCommand";
            return "Duke heard: " + input;
        }
    }

    public String getCommandType() {
        return commandType;
    }
}
