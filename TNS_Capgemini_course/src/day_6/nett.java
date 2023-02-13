package day_6;

public class nett {
    int i=0;
    public static void main(String[] args) {
        nett obj = new nett();
        obj.setrollno(30);
        System.out.println(obj.getrollno());
    }

    private int getrollno() {
        return i;
    }

    private void setrollno(int x) {
        i=x;
    }


}
