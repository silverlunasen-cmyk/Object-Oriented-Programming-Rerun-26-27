package Interfaces.Exercise2;

public class Door implements Interactable
{
    private final String description;

    public Door(String description)
    {
        this.description = description;
    }

    @Override
    public boolean interact()
    {
        System.out.println("You open the " + description + "...");
        return false;
    }

    @Override
    public String getDescription()
    {
        return description;
    }
}
