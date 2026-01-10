package class7;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Apple");
        stringSet.remove("Apple");

        Set<String> anotherSet = Set.of("Grapes", "Mango", "Pineapple");
        stringSet.addAll(anotherSet);
        stringSet.remove("Grapes");

        for (String fruit : stringSet) {
            System.out.println("Fruit: " + fruit);
        }


    }
}
