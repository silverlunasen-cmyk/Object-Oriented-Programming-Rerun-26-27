package Ordering.Excercise6;


import java.util.Comparator;

public class NewCompare implements Comparator<NewProduct> {
    @Override public int compare(NewProduct a, NewProduct b) {
        int byRating = safeCompareDescNullLast(a.rating(), b.rating());
        if (byRating != 0)
        {
            return byRating;
        }
        return a.name().compareTo(b.name());
    }

    private static int safeCompareDescNullLast(Double ratingA, Double ratingB)
    {
        if (ratingA == null && ratingB == null)
        {
            return 0;
        }
        if (ratingA == null)
        {
            return 1;
        }
        if (ratingB == null)
        {
            return -1;
        }
        return Double.compare(ratingB, ratingA);
    }
}