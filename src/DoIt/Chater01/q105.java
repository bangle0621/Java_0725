package DoIt.Chater01;

public class q105 {
    //중앙값을 구하는 메서드는 다음과 같이 작설할 수도 있습니다. 그러나 실습 1C-1의 med3  메서드에 비해 효율이 떨어지는데, 그 이유를 설명하세요.
    static int med3(int a, int b, int c){
        if((b >= a && c <= a) || (b <= a && c>= a))
            return a;
        else if((a>b && c<b)|| (a < b && c >b))
            return b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println("med3(1,2,3):"+ med3(1,2,3));
        System.out.println("위의 경우, b가 1보다 크기에 b>= a 에 해당하여 참이지만, && 계산을 위해 뒤의 c <= a 까지 확인하여 거짓임을 확인한다" +
                "|| 으로, 뒤가 참인지 확인하기 위해 b<=a를 확인하여 이는 거짓임을 확인하여 다음 구문으로 내려간다" +
                "a> b && c<b 는 거짓이지만 || 로 연결되어있어 뒤를 확인하고" +
                "a<b && c > b가 참이여서 해당 부분을 리턴한다" +
                "이처럼 &&, || 으로 비교하며 거의 모든 구문을 확인해야 하기에 효율이 떨어진다.");
    }
}
