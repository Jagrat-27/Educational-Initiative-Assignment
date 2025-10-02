package Exercise2.Problem3;

import java.util.HashMap;
import java.util.Map;

public class CommandInvoker {
    private Map<Character, Command> commandMap = new HashMap<>();

    public void registerCommand(char key, Command command) {
        commandMap.put(key, command);
    }

    public void execute(char key) {
        if (commandMap.containsKey(key)) {
            commandMap.get(key).execute();
        } else {
            System.out.println("⚠ Invalid command: " + key);
        }
    }
}
