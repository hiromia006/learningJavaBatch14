package class3;

public class IfStatements {
    public static void main(String[] args) {
        //  Simple if statement
        int age = 10;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        //  if-else statement
        int number = 70;
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        //  if-else-if ladder
        int score = -85;
        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Grade: B");
        } else if (score >= 70 && score < 80) {
            System.out.println("Grade: C");
        } else if (score >= 60 && score < 70) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // Nested if statement
        int num = 15;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is a positive even number.");
            } else {
                System.out.println(num + " is a positive odd number.");
            }
        }
    }
}
