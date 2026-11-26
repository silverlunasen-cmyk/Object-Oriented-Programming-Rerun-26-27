package Interfaces.Exercise4;

public class Enemy
{
    private AttackStrategy strategy;

    public Enemy(AttackStrategy strategy)
    {
        setStrategy(strategy);
    }

    public void setStrategy(AttackStrategy strategy)
    {
        if(strategy == null)
        {
            throw new IllegalArgumentException("Strategy cannot be null!");
        }
        this.strategy = strategy;
    }

    public String performAttack(String targetName) {
        return strategy.attack(targetName);
    }
}

