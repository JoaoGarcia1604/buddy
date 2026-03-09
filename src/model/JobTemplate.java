package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobTemplate {
    private static int counter = 1;

    private int id;
    private String name;
    private List<Item> items = new ArrayList<>();

    public JobTemplate(String name){
        this.name = name;
        this.id = counter++;
    }

    public int getId(){
        return id;
    }

    public void addItem(Item item){
        items.add(item);
    }

}
