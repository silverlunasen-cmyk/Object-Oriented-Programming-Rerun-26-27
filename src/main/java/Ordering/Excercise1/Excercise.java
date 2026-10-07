package Ordering.Excercise1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Task: Create a Score(player:String, value:int) class that implements Comparable<Score>.
// Sorting rule: value descending, then player name ascending.

public class Excercise
{
    static void main()
    {
        List<Score> scores = new ArrayList<>();
        scores.add(new Score("Terrence", 25));
        scores.add(new Score("The Rumpled", 4));
        scores.add(new Score("Jendrik", 3));
        scores.add(new Score("Kole", 25));
        scores.add(new Score("Andersson", 26));

        Collections.sort(scores);

        System.out.println(scores);

        System.out.println(scores.get(0).getValue() >= scores.get(1).getValue());
        System.out.println(scores.get(scores.size()-1).getValue() <= scores.get(scores.size()-2).getValue());
    }
}
