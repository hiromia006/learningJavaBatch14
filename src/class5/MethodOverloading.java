package class5;

public class MethodOverloading {
     void printSum(){
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    private void printSum(int a, int b){
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }


    protected void printSum(double a, double b){
        double sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public void printSum(float a, float b){
        float sum = a + b;
        System.out.println("Sum: " + sum);
    }
}
