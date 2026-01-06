package class3;

public class JumpingStatement {
    public static void main(String[] args) {
        // Using break statement in a loop
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // Exit the loop when i is 6
            }
            System.out.println("Iteration: " + i);
        }

        System.out.println("-------------------");

        // Using continue statement in a loop
        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("Odd Number: " + j);

        }
    }
}
