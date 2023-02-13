package day_6;
class parent{

    public void add(int x, int y) {
        System.out.println(x+y);
    }
}
public class child extends parent {
    public static void main(String[] args) {
        child obj = new child();
        obj.add(5,5);
    }

    public void add(int x, int y) {
        super.add(x,y);
    }
}

