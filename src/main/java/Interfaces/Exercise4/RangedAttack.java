package Interfaces.Exercise4;

public class RangedAttack implements AttackStrategy
{
    @Override
    public String attack(String targetName)
    {
        return "Shoots arrow at <" + targetName +  ">";
    }

}
