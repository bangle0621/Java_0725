package DoIt.Chater01;

import java.util.Scanner;

public class c1c01a {
    static int mid3(int a, int b, int c){
        if(a >= b)
            if(b>=c)
                return b;
            else if(a <= c)
                return a;
            else
                return c;
        else if ( a > c)
            return a;
        else if(b > c)
            return c;
        else
            return b;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.println("a의 값: ");
        int a = input.nextInt();
        System.out.println("b의 값 : ");
        int b = input.nextInt();
        System.out.println("c의 값: ");
        int c = input.nextInt();

        System.out.println("중앙값은  " + mid3(a,b,c)+ " 입니다.");
    }
}
