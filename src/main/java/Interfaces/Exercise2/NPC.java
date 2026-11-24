package Interfaces.Exercise2;


public class NPC implements Interactable {

    private final String name;

    public NPC(String name) {
        this.name = name;
    }

    @Override
    public boolean interact() {
        System.out.println(name + " says: \"Hello, traveller!\"");
        return false;
    }

    @Override
    public String getDescription() {
        return "NPC " + name;
    }
    @Override
    public int interactionRange() {
        return 4;
    }
}