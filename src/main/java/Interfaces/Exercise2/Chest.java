package Interfaces.Exercise2;

public class Chest implements Interactable
{
    private final String description;

    public Chest(String description)
    {
        this.description = description;
    }

    @Override
    public boolean interact() {
        System.out.println("You open the " + description + " and find... a bomb!");
        return false;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
