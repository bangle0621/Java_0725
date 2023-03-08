package Ex11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex11_6 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] arr2D = {{11,12,13,14},{21,22,23}};

        //배열 출력
        System.out.println("arr ="+ Arrays.toString(arr));
        //2차월 배열 출력
        System.out.println("arr2D = "+ Arrays.deepToString(arr2D));

        //배열 복사하여 새로운 배열 생성, 복사 위치도 지정해서
        int[] arr2 = Arrays.copyOf(arr,3);
        int[] arr3 = Arrays.copyOf(arr, 5);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 3, 5);
        int[] arr6 = Arrays.copyOfRange(arr, 4, 8);
        //프린트
        System.out.println("arr2 : "+ Arrays.toString(arr2));
        System.out.println("arr3 : "+ Arrays.toString(arr3));
        System.out.println("arr4 : "+ Arrays.toString(arr4));
        System.out.println("arr5 : "+ Arrays.toString(arr5));
        System.out.println("arr6 : "+ Arrays.toString(arr6));

        //배열 채우기
        int[] arr7 = new int[5];

        Arrays.fill(arr7, 5);
        System.out.println("arr7 : "+Arrays.toString(arr7));
        //배열 랜덤 값으로 채우기

        Arrays.setAll(arr7, i->(int)(Math.random()*6)+1);
        System.out.println("arr7 random : "+Arrays.toString(arr7));

        //arr7 배열 이용하여 for문 *표 뽑기
        for(int i : arr7){
            char[] cha = new char[i];
            Arrays.fill(cha, '*');
            System.out.println(new String(cha)+i);
        }
        //다중배열 같은거 2개 생성
        String[][] str1 = {{"a", "b", "c"}, {"d", "e", "f"}};
        String[][] str2 = {{"a", "b", "c"}, {"d", "e", "f"}};

        //비교
        System.out.println(Arrays.equals(str1,str2));
        System.out.println(Arrays.deepEquals(str1,str2));
        //이진 탐색
        char[] car3 = {'a','f','c','b','e'};

        System.out.println(Arrays.toString(car3));
        System.out.println(Arrays.binarySearch(car3, 'b'));
        Arrays.sort(car3);
        System.out.println(Arrays.binarySearch(car3, 'b'));
    }


}
