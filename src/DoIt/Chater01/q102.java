package DoIt.Chater01;

public class q102 {
    public static void main(String[] args) {
        //세 값의 최소값을 구하는 min3 메서드를 작성하세요
        min3(1,2,3);
        min3(3,2,1);
        min3(6,0,3);
    }

    static void min3(int a, int b, int c){
        int min = a;
        if(min > b) min = b;
        if(min > c) min = c;

        System.out.println("min : "+ min);
    }
}
