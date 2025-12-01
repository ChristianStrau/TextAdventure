package core;

import commands.HelpCommand;
import commands.QuitCommand;

import java.util.Scanner;

public class Game {
    private Player player;              // Der Spieler
    private CommandProcessor commandProcessor = new CommandProcessor();  // Verarbeitet Befehle
    private Scanner scanner = new Scanner(System.in);             // Liest Benutzereingaben
    private boolean gameOver;

    public CommandProcessor getCommandProcessor(){
        return commandProcessor;
    }

    public void start() {
        printWelcome();      // Willkommensnachricht
        setupWorld();        // Spielwelt aufbauen
        while (!gameOver) {  // Hauptspielschleife
            String input = scanner.nextLine();
            String result = commandProcessor.processInput(input, this);
            System.out.println(result);
        }
    }
    void printWelcome(){
        System.out.println("Hello and welcome to my Text Adventure game!");
    }
    private void setupWorld() {
        commandProcessor.registerCommand(new HelpCommand());
        commandProcessor.registerCommand(new QuitCommand());

        player.se
        // Räume erstellen und verbinden
        // Items (Gegenstände) hinzufügen
        // NPCs (Charaktere) platzieren
    }

    public void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    public void setGameOver(boolean status) {
        this.gameOver = status;
    }
}
