package Interfaces.Exercise2;

public interface Interactable
{
    boolean interact();

    String getDescription();


    default int interactionRange()
    {
        return 2;
    }
    default boolean canInteract(int distanceToPlayer)
    {
        return distanceToPlayer >= 0 && distanceToPlayer <= interactionRange();
    }
}
