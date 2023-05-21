package javaQ;

public class q001 {

    public static void main(String[] args) {
        /*001.문자 개수 세기 : 주어진 문자열에서 문자 개수를 세는 프로그램을 작성하라.*/
        String str = "안녕하세요";

        String[] strArr = str.split("");
        System.out.println("문자열 길이는?:"+strArr.length);
    }

}
