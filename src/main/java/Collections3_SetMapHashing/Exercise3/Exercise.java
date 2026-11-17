package Collections3_SetMapHashing.Exercise3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Exercise {

    static final Comparator<Map.Entry<String, Integer>> RANKING =
            Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
                    .thenComparing(Map.Entry.comparingByKey());

    public static List<String> leaderboard(Map<String, Integer> scores) {
        if (scores == null)
            throw new IllegalArgumentException("scores must not be null");

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(RANKING);
        pq.addAll(scores.entrySet());

        List<String> ranked = new ArrayList<>();
        while (!pq.isEmpty()) {
            ranked.add(pq.poll().getKey());
        }
        return ranked;
    }

    public static void main() {
        Map<String, Integer> scores = Map.of("Ana", 80, "Ben", 95, "Cara", 80, "Dev", 60);
        System.out.println(leaderboard(scores));
    }
}