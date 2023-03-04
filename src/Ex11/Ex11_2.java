package Ex11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_2 {
    public static void main(String args[]){
        //스택과 큐 객체 생성
        Stack st = new Stack();
        Queue que = new LinkedList();

        //각각에 값 넣음
        st.push("0");
        st.push("1");
        st.push("2");

        que.offer("0");
        que.offer("1");
        que.offer("2");

        //반복문을 이용해 비어있는지 확인. 비어있지 않으면 꺼냄
        while(!st.isEmpty()){
            System.out.println("스택:"+st.pop());
        }

        while(!que.isEmpty()){
            System.out.println("큐:"+que.poll());
        }
    }
}
