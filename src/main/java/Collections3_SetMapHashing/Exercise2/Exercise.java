package Collections3_SetMapHashing.Exercise2;

import java.util.HashMap;
import java.util.Map;

public class Exercise
{
    public static Map<String, Integer> wordFrequency(String sentence)
    {
        Map<String, Integer> freq = new HashMap<>();
        if (sentence == null || sentence.isBlank())
            return freq;

        for(String word : sentence.trim().split("\\s+"))
        {
            freq.merge(word.toLowerCase(), 1, Integer::sum);
        }
        return freq;
    }
    static void main()
    {
        System.out.println(wordFrequency("This evil man is using the evil metaverse for evil"));

    }
}
