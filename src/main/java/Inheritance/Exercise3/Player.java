package Inheritance.Exercise3;

public class Player extends Entity
{
    private int score;

    public Player(String name, int score)
    {
        super(name);
        this.score = score;

    }
    @Override
    public String describe()
    {
        return "Player: " + name() + " (Score: " + score + ")";
    }
}
