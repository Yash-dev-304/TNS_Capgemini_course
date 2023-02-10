package Day_4;

public class Base {
    int varDefault=10;
    public int varPublic=20;
    private int varPrivate=30;
    protected int varProtected=40;
    void methodDeafault(){
        System.out.println("Default access Base class");
    }
    public void methodPublic(){
        System.out.println("public access Base class");
    }
    private void methodPrivate(){
        System.out.println("private access Base class");
    }
    protected void methodProtected(){
        System.out.println("protected access Base class");
    }
}
