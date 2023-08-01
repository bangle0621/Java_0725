package DoIt.Chater01;

public class q101 {
    public static void main(String[] args) {
        //네 값의 최댓값을 구하는 max 4 메서드를 작성하세요.
        max4(3,6,4,7);
        max4(7,2,4,7);
        max4(3,0,4,1);
        max4(3,6,-9,-7);
        max4(3,6,4,1);
    }

    static void max4(int a, int b, int c, int d){
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;

        System.out.println("max : " + max);
    }
}

