public class FlowControll {
    public static void main(String args[]){
        
        int num1 = 1;
        int num2 = 2;
        
        //if 문
        if(num1>num2) System.out.println("num1은 num2보다 커");
        
        //else문
        if(num1>num2) System.out.println("num1은 num2보다 커");
        else System.out.println("num2가 num1보다 커");

        
        //else if문
        if(num1>num2) System.out.println("num1은 num2보다 커");
        else
            if(num1==num2) System.out.println("num1과 num2는 같아");
            else System.out.println("num2는 num1보다 커");


        if(num1>num2) System.out.println("num1은 num2보다 커");
        else if(num1==num2) System.out.println("num1과 num2는 같아");
        else System.out.println("num2는 num1보다 커");



        //switch 문
        int n = 3;

        switch(n){
        case 1: System.out.println("오늘은 영화를 볼거야");
            break;
        case 2: System.out.println("오늘은 밥을 먹을거야");
            break;
        case 3: System.out.println("오늘은 공부를 할거야");
            break;
        case 4: System.out.println("오늘은 잠을 잘거야");
            break;
        }

        //while
        int m = 0;
        
        while(m<5){
            System.out.println("m은 5보다 작다.");
            m++;
        }
        System.out.println("m은 5와 같거나 크다");


        int count = 0;

        do {
            System.out.println("카운트 시~작!"+count);
            count++;
        } while(count<10);{
            System.out.println("숫자"+count);
        }
        System.out.println("숫자 다 셌다!!"+count);

        //for문
        for(int jj=0;jj<10;jj++){
            System.out.println("jj는 얼마나 열심히하지?"+jj);
        }


        //break문. 공배수를 찾는 반복문.
        int basu = 0;

        while(basu<100){
            basu++;
            if(basu % 5 ==0 && basu % 7 ==0) {
                System.out.println("5와 7의 공배수는?" + basu);
                break;
            }
        }

        while(basu<100){
            basu++;
            if(basu % 5 ==0 && basu % 7 ==0){
                System.out.println("CONTINUE: 5와 7의 공배수는?"+basu);
                continue;
            }
        }

        //for문의 중첩
        

        //continue문. 공배수를 찾는 반복문.
    }
}
