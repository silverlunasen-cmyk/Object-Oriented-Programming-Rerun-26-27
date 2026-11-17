package Collections3_SetMapHashing.Exercise4;
import java.util.*;


public class Exercise
{
     static Map<Character, List<String>> groupByFirstLetter(List<String> words)
     {
         Map<Character, List<String>> groups = new TreeMap<>();
         if (words == null)
             return groups;

         for (String word : words)
         {
             if(word == null || word.isEmpty())
             {
                 continue;
             }
             char key = Character.toLowerCase(word.charAt(0));
             groups.computeIfAbsent(key, k2 -> new ArrayList<>()).add(word);
         }
         return groups;
     }

    public static void main() {
        List<String> words = List.of("pear", "apple", "Plum", "banana", "avocado");
        System.out.println(groupByFirstLetter(words));
    }
}
