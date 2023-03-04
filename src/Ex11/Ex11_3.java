package Ex11;

import java.util.Stack;

public class Ex11_3 {
    public static void main(String args[]){
        //스택 객체 생성
        Stack st1 = new Stack();
        //수식생성
        String expression = "(((2+3)-7+3)))";

        //try-catch
        try {
            for (int i = 0; i<expression.length(); i++){
                char ch = expression.charAt(i);

                if(ch == '('){
                    st1.push("(");
                }else if(ch == ')'){
                    st1.pop();
                }
            }
            if(st1.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            }else{
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (Exception e){
            System.out.println("괄호가 일치하지 않습니다.");
        }
        //참 : 괄호가 일치합니다.거짓: 괄호가 일치하지 않습니다.
    }
}
