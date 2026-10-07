package Ordering.Excercise1;

public class Score implements Comparable<Score>
{

    private String player;
    private int value;

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Score(String player, int value) {
        this.player = player;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Score{" +
                "player='" + player + '\'' +
                ", value=" + value +
                '}' + "\n";
    }
    @Override
    public int compareTo(Score other)
    {
        int byValue = Integer.compare(other.value, this.value);
        if (byValue != 0) return byValue;
        return this.player.compareTo(other.player);
    }
}
