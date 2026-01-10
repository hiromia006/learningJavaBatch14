package class7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(30.4);
        doubleList.add(10.4);
        doubleList.add(10.4);
        doubleList.add(40.4);
        doubleList.add(1, 50.10);
        doubleList.remove(2);


        List<Double> anotherList = Arrays.asList(100.5, 200.5, 300.5);
        doubleList.addAll(anotherList);


        for (Double d : doubleList) {
            System.out.println("Double Value: " + d);
        }
    }
}
