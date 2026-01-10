package class7;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("Alice", 90);
        scoreMap.put("Bob", 10);
        scoreMap.put("Charlie", 95);
        System.out.println(scoreMap);

        Map<String, Object> maps = new HashMap<>();
        maps.put("Name", "David");
        maps.put("Age", 25);
        maps.put("IsStudent", true);
        maps.put("city", "New York");
        maps.remove("IsStudent");
        System.out.println(maps);
        System.out.println("Name: " + maps.get("Name"));
    }
}
