package Day_2;

public class Continuedemo {
    public static void main(String[] args) {
        for(int i=5;i<15;i++){
            if(i%2!=0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
