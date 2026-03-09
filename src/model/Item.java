package model;

public class Item {

    private int id = 1;
    private String name;

    public Item(String name){
        this.name = name;
        this.id += 1;
    }
}
