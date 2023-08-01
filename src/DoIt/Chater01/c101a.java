package DoIt.Chater01;

import java.util.Scanner;

public class c101a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다");
        System.out.println("a의 값 : "); int a = input.nextInt();
        System.out.println("b의 값 : "); int b = input.nextInt();
        System.out.println("c의 값 : "); int c = input.nextInt();

        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        System.out.println("최댓값은 " + max + "입니다.");
    }
}
