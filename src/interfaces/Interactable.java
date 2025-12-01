package interfaces;

import core.Player;

public interface Interactable {
    String interact(Player player);
    String getName();
    String getDescription();
}
