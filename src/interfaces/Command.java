package interfaces;

public interface Command {
    String execute(Game game, String[] args);
    String getKeyword();
    String getHelp();
}
