package class5;

public class AccessModifier {
    public String publicVar = "I am a public variable";
    private String privateVar = "I am a private variable";
    protected String protectedVar = "I am a protected variable";
    int age = 50;

    public AccessModifier() {
    }

    public void publicVariables() {
        System.out.println("Public Method  ");
    }

    private void privateMethod() {
        System.out.println("Private Method  ");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method  ");
    }

    void defaultMethod() {
        System.out.println("Default Method  ");
    }

    public static void main(String[] args) {
        AccessModifier accessObj = new AccessModifier();
        System.out.println(accessObj.publicVar);
        accessObj.publicVariables();

        System.out.println(accessObj.privateVar);
        accessObj.privateMethod();

        System.out.println(accessObj.protectedVar);
        accessObj.protectedMethod();

        System.out.println(accessObj.age);
        accessObj.defaultMethod();
    }


}
