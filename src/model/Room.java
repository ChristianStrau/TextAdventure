package model;

import core.Player;

import java.util.List;
import java.util.Map;

public abstract class Room {
    String name;
    String description;
    Map<String, Room> exists;
    List<Item> items;

    protected abstract String  onEnter(Player player);

    void setExit(String direction, Room room){}
    void addItem(Item item){}
}
