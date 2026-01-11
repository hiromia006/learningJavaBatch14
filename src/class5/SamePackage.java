package class5;

public class SamePackage {
    public static void main(String[] args) {
        AccessModifier accessObj = new AccessModifier();
        System.out.println(accessObj.publicVar);
        accessObj.publicVariables();


       //  The following lines would cause compilation errors due to access restrictions
//         System.out.println(accessObj.privateVar);
//         accessObj.privateMethod();

        System.out.println(accessObj.protectedVar);
        accessObj.protectedMethod();

        System.out.println(accessObj.age);
        accessObj.defaultMethod();
    }
}
