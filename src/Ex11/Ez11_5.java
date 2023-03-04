package Ex11;

import java.util.ArrayList;
import java.util.Iterator;

public class Ez11_5 {
    public static void main(String[] args){
        //리스트 객체 생성
        ArrayList list = new ArrayList();
        //리스트에 데이터 셋팅
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //Iterator 사용해서 안의 값 print
        Iterator it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
