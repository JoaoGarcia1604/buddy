package model;

public enum Category {

    MACHINE("Máquina"),
    MANUAL("Manual");

    private final String description;

    Category(String description){
        this.description = description;
    }

}
