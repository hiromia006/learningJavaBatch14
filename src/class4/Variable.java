package class4;

public class Variable {
    int instanceVar = 10; // Instance variable
    static int staticVar = 20; // Static variable

    public void method1() {
        int localVar1 = 30; // Local variable
        System.out.println("Local Variable: " + localVar1);
//        System.out.println("Local Variable: " + localVar2);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public void method2() {
        int localVar2 = 30; // Local variable
        System.out.println("Local Variable: " + localVar2);
//        System.out.println("Local Variable: " + localVar1);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);

    }

    public static void main(String[] args) {
        System.out.println("Static Variable: " + Variable.staticVar);
        Variable varObj = new Variable();
        System.out.println(varObj.instanceVar);
        varObj.method1();
        varObj.method2();

    }

}
