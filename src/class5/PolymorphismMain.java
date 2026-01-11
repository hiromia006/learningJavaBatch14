package class5;

public class PolymorphismMain {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.printSum();
        mo.printSum(10.25f, 20.75f);
        mo.printSum(125.50, 224.75);


        QaEngineer  engineer= new QaEngineer();
        engineer.performTask();
    }
}
