package Interfaces.Exercise4;

public class MeleeAttack implements AttackStrategy
{
    @Override
    public String attack(String targetName)
    {
        return "Swings sword at <" + targetName + ">";
    }
}
