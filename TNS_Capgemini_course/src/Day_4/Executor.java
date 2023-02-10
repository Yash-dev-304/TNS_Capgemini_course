package Day_4;

public class Executor {
    public static void main(String[] args) {
        Base b1= new Base();
        b1.methodPublic();
        b1.methodDeafault();
        b1.methodProtected();
        b1.varDefault=11;
        System.out.println(b1 instanceof Base);
    }
}
