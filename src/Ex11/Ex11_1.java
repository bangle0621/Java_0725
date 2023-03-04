package Ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex11_1 {
    public static void main(String args[]){
    //기본 길이 10인 ArrayList를 생성
        List list1 = new ArrayList(10);

    //값 셋팅
        list1.add(new Integer(1));
        list1.add(new Integer(5));
        list1.add(new Integer(8));
        list1.add(new Integer(7));
        list1.add(new Integer(3));
        list1.add(new Integer(4));
        list1.add(new Integer(9));
        list1.add(new Integer(0));

        //뽑고싶은 부분만 뽑아서 새로운 ArrayList 를 뽑아준다.
        ArrayList list2 = new ArrayList(list1.subList(2,6));
        print(list1, list2);

    //정렬을 하여 보여준다.
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1,list2);

    //포함하고 있는지 여부를 확인한다.
        System.out.println("show contain list1 3 :"+ list1.contains(3));
        System.out.println("show contain list2 0 :" + list2.contains(0));

    //리스트의 중간에 위치를 지정하여 값을 넣어준다. but 중간에 끼워넣는 것은 부담이 가는 작업이다.
        list1.add(6);
        list2.add(2);
        print(list1,list2);

    //리스트의 중간 위치에 자리를 지정하여 값을 바꿔준다.
        list1.set(0, 7);
        list2.set(3,"5");
        print(list1,list2);

    //문자열로 숫자를 넣어 위치를 반환한다.
        System.out.println("what is String index of list2? : " + list2.indexOf("5"));
        System.out.println("what is int 5 index of list1? : " + list1.indexOf(new Integer(5)));

    //위치를 지정하여 값을 지워준다.
        list2.add(new Integer(5));
        list1.remove(4);
        list2.remove("5");
        print(list1,list2);

    //값을 지정하여 값을 지워준다.
        list1.remove(new Integer(9));
        list2.remove(new Integer(5));
        print(list1, list2);

    //겹치는 부분만 남기고 나머지는 삭제한다.
        list1.retainAll(list2);
        print(list1, list2);

    //list2에서 list1에 포함된 객체들을 삭제한다.
        for (int i= 0; i<list2.size()-1; i++){
            if(list1.contains(list2.get(i))){
                list2.remove(i);
            }
        }
        print(list1, list2);

    // 배열의 길이 제한 확인
        list1.add(4);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(0);
        list1.add(1);

        print(list1, list2);

    }

    static void print(List a, List b){
        System.out.println("I'm list1 : " + a);
        System.out.println("I'm list2 : " + b);
    }

}
