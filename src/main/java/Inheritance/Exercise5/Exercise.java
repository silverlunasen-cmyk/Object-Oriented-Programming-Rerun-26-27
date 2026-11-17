package Inheritance.Exercise5;
import java.util.ArrayList;

public class Exercise
{
    static void main()
    {
        ArrayList<GameEntity> entities = new ArrayList<>();

        entities.add(new PlayerEntity("Harold"));
        entities.add(new EnemyEntity("Evil Harold"));

        double dt = 0.016;

        for(GameEntity ge : entities)
        {
            ge.update(dt);
            ge.render();
        }
    }



}
