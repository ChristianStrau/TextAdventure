package interfaces;

import core.Game;

public interface Command {
    String execute(Game game, String[] args);
    String getKeyword();
    String getHelp();
}
