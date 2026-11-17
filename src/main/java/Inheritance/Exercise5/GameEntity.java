package Inheritance.Exercise5;

abstract class GameEntity
{
    protected final String name;

    public GameEntity(String name)
    {
        this.name = name;
    }

    public abstract void update(double dt);
    public abstract void render();

}
