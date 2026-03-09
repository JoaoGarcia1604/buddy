package model;

public enum ImportanceLevel {

    LOW(1, "Almost never used"),
    MEDIUM(2, "Pode ser necessário"),
    HIGH(3, "Provavelmente vai usar"),
    CRITICAL(4, "Sempre é usado");

    private final int level;
    private final String description;

    ImportanceLevel(int level, String description){
        this.level = level;
        this.description = description;
    }

    public int getLevel(){
        return level;
    }

    public String getDescription(){
        return description;
    }

}
