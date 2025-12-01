package commands;

import core.Game;
import interfaces.Command;

public class QuitCommand implements Command {
    @Override
    public String execute(Game game, String[] args) {
        game.setGameOver(true);
        return "Spiel wird beendet...";

    }

    @Override
    public String getKeyword() {
        return "quit";
    }

    @Override
    public String getHelp() {
        return "Beendet das Spiel";
    }
}
