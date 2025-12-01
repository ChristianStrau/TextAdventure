package commands;

import core.CommandProcessor;
import core.Game;
import interfaces.Command;

import java.util.Map;

public class HelpCommand implements Command {
    @Override
    public String execute(Game game, String[] args) {

        CommandProcessor cmdProcessor = game.getCommandProcessor();
        Map<String, Command> commands = cmdProcessor.getCommands();

        for(Command cmd : commands.values()){
            System.out.println(cmd.getHelp());
        }

        return "";
    }

    @Override
    public String getKeyword() {
        return "help";
    }

    @Override
    public String getHelp() {
        return "Das ist die Help Methode";
    }
}
