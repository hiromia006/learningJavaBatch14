package class3;

public class LoopStatements {
    public static void main(String[] args) {
        // Simple for loop
        for (int i = 1; i <= 15; i += 3) {
            System.out.println("Iteration: " + i);
        }
        System.out.println("-------------------");
        int j = 50;
        for (; j > 0; j -= 5) {
            System.out.println("Countdown: " + j);
        }
        System.out.println("-------------------");
        // example of extend loop
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        for (String abc : fruits) {
            System.out.println("Fruit: " + abc);
        }
        System.out.println("-------------------");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // while loop
        System.out.println("-------------------");
        int count = 1;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // do-while loop
        System.out.println("-------------------");
        int n = 1;
        do {
            System.out.println("Number: " + n);
            n++;
        } while (n < 5);
    }
}
