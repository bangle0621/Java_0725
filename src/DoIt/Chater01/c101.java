package DoIt.Chater01;

import java.util.Scanner;

public class c101 {
    public static void main(String args[]){
        //세 값중 최대의 값을 구하기
        Scanner input = new Scanner(System.in);

        System.out.println("a의 값 입력 : ");
        int a = input.nextInt();
        System.out.println("b의 값 입력 : ");
        int b = input.nextInt();
        System.out.println("c의 값 입력 : ");
        int c = input.nextInt();

        int max = 0;

        if(a > b){
            if(b > c){
                max = a;
            } else {
                max = c;
            }
        } else if (b>c){
            max = b;
        } else {
            max = c;
        }
        System.out.println("MAX : " + max);
    }

}
