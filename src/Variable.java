class Variable {
    public static void main (String args[]){
//        1. 변수를 선언하고, 선언한 변수에 값을 저장.
//        2. 변수 선언과 동시에 변수에 값을 저장.
//        3. 변수 선언과 그 값에 위의 두 변수의 값을 대상으로 셈.
//        4. sysout으로 결과를 노출하기.

        int num1;
        num1 = 10;
        int num2 = 20;
        int result = num1 + num2;
        System.out.println(num1 +"+" +num2 +"=" +result);


//        1. 실수형 변수를 선언. 두개의 변수 동시에 선언
//        2. 두 변수에 각각 값을 담고, 두 변수를 사용한 결과 변수를 선언.
//        3. sysout으로 결과를 노출하기.

        double cash1 , cash2;
        cash1 = 1000.50;
        cash2 = 100121.3001;

        double sumCash = cash1 + cash2;
        System.out.println(cash1+"+"+ cash2+"="+sumCash);

//        1. 문자 변수에 값 할당.
//        2. 1번에서 선언한 문자변수의 유니코드 값을 캐릭터형으로 변수 할당.
//        3. 16진수로 표현한 값 캐릭터형으로 변수 할당.
//        4. sysout으로 결과 노출

        char ch1 = '안';
        char ch2 = '녕';
        char ch3 = 50504;
        char ch4 = 45397;
        System.out.println(ch1+""+ch2);
        System.out.println(ch3+""+ch4);

//        1. boolean형 변수 선언.
//        2. sysout으로 변수 출력.
//        3. 정수형 변수 선언.
//        4. 비교형으로 결과 값 sysout으로 출력.

        boolean bo1 = true;
        boolean bo2 = false;
        System.out.println(bo1+" "+bo2);

        int no1 = 10;
        int no2 = 20;
        System.out.println(no1>no2);
        System.out.println(no1<no2);
    }
}
