package DoIt.Chater01;

public class c102 {
    public static void main(String[] args) {

        maxResult(3,5,6);
        maxResult(6,2,1);
        maxResult(3,5,0);
        maxResult(3,3,3);
        maxResult(8,5,6);
        maxResult(2,5,6);
        maxResult(3,3,8);
        maxResult(0,-1,1);
        maxResult(11,3,-6);
    }

    static void maxResult(int a, int b, int c){
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        System.out.println("max : " + max);
    }
}


