package class4;

public class Method {
    public void printMessage() {
        System.out.println("Hello from printMessage method!");
    }

    public int sum() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        return sum;
    }

    public void printSum() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }

    public void printSubtraction(int a, int b) {
        int subtraction = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is: " + subtraction);
    }

    public static void main(String[] args) {
        Method methodObj = new Method();
        methodObj.printMessage();
        System.out.println("Returned sum is: " + methodObj.sum());

        methodObj.printSum();
        methodObj.printSubtraction(15, 5);

    }


}
