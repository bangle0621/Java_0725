package DoIt.Chater01;

public class c1c01 {
    //3개의 정숫값을 입력하고 중앙값을 구한 다음 출력합니다.
    public static void main(String[] args) {
        System.out.println("mid : "+ mid(1,2,3));
        System.out.println("mid : "+ mid(2,1,3));
        System.out.println("mid : "+ mid(1,3,2));
        System.out.println("mid : "+ mid(3,2,1));
        System.out.println("mid : "+ mid(2,3,1));
        System.out.println("mid : "+ mid(3,1,2));

    }

    static int mid(int a, int b, int c){
        int res = 0;
        if(a > b) {
            if(b > c) {
                //a > b > c
                res = b;
                return res;
            } else if(c > a){
                //c > a > b
                res = a;
                return res;
            } else {
                //a > c > b
                res = c;
                return res;
            }
        } else {
            if(a > c){
                //b > a > c
                res = a;
                return res;
            } else if(c > b){
            // c > b > a
                res = b;
                return res;
            } else {
                //b > c > a
                res = c;
                return res;
            }
        }
    }
}
