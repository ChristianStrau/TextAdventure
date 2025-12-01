package core;

import interfaces.Command;

import java.util.HashMap;
import java.util.Map;

public class CommandProcessor {
    Map<String, Command> commands = new HashMap<>();
    String[] args = new String[0];



    public void registerCommand(Command cmd) {
        commands.put(cmd.getKeyword(), cmd);

    }

    public String processInput(String input,Game game) {
        String[] parts = input.split(" ");
        Command cmd = commands.get(parts[0].toLowerCase());


        return cmd.execute(game, args);
    }

    public Map<String, Command> getCommands(){
        return commands;
    }
}
