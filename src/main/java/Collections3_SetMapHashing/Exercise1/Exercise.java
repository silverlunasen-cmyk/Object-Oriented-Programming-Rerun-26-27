package Collections3_SetMapHashing.Exercise1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise
{
    static int countUniqueVisitors(List<String> logEntries)
    {
        if(logEntries == null)
        {
            throw new IllegalArgumentException("logEntries mustn't be null!");
        }
        Set<String> ips = new HashSet<>();
        for (String entry : logEntries) {
            if (entry == null)
                continue;

            int comma = entry.indexOf(',');
            if (comma < 0)
                continue;

            String ip = entry.substring(comma + 1).trim();
            if (!ip.isEmpty())
                ips.add(ip);
        }
        return ips.size();
    }
    static void main(String[] args)
    {
    List<String> log = List.of("09:00,10.0.0.1",
                "09:01,10.0.0.2",
                "09:02,10.0.0.1",
                "malformed line",
                "09:03,10.0.0.3");
        System.out.println("Unique ipAdresses: " + countUniqueVisitors(log));
    }
}
