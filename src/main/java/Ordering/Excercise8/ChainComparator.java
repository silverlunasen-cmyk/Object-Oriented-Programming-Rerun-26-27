package Ordering.Excercise8;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;


public final class ChainComparator<T> implements Comparator<T> {
    private final List<Comparator<T>> chain;

    @SafeVarargs
    public ChainComparator(Comparator<T>... comparators) {
        this.chain = Arrays.asList(comparators);
    }

    @Override
    public int compare(T a, T b) {
        for (Comparator<T> c : chain)
        {
            int result = c.compare(a, b);
            if (result != 0)
            {
                return result;
            }
        }
        return 0;
    }

}
