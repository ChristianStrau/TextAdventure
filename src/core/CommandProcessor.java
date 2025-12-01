package core;

import interfaces.Command;

import java.util.Map;

public class CommandProcessor {
    Map<String, Command> commands;
    String[] args = new String[0];



    public void registerCommand(Command cmd) {
        commands.put(cmd.getKeyword(), cmd);
    }

    public String processInput(String input,Game game) {
        String[] parts = input.split(" ");
        Command cmd = commands.get(parts[0]);

        return cmd.execute(game, args);
    }
}
