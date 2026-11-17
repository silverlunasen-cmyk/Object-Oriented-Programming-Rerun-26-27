package Collections3_SetMapHashing.Exercise5;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise
{
    public static Set<Integer> intersection(List <Integer> a, List<Integer> b)
    {
        if(a == null || b == null)
        {
            throw new IllegalArgumentException("Lists must NOT be null!");
        }
        Set<Integer> result = new HashSet<>(a);
        result.retainAll(new HashSet<>(b));
        return result;
    }
    static void main()
    {
        System.out.println(intersection(List.of(5,2,4,7,3),List.of(6,8,9,2,7)));
    }
}
