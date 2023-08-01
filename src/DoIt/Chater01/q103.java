package DoIt.Chater01;

public class q103 {
    public static void main(String[] args) {
        //네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
        min4(6,5,4,3);
        min4(1,2,3,4);
        min4(0,4,3,1);
    }
    static void min4(int a, int b, int c, int d){
        int min = a;
        if(min > b) min = b;
        if(min > c) min = c;
        if(min > d) min = d;
        System.out.println("min : "+ min);
    }
}
