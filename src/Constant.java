public class Constant {
    public static void main(String args[]){

//        [예제]
//        1.AB + \b + C
//        2.AB + \t + C
//        3.AB + \n + C
//        4.AB + \r + C
        char a = 'A';
        char b = 'B';
        char c = 'C';
        System.out.println('A'+'B' + '\b' + c);
        System.out.println('A'+'B'+'\t'+'C');
        System.out.println('A'+'B'+'\n'+'C');
        System.out.println('A'+'B'+'\r'+'C');

//      [예시]
//        1. 실수형을 정수형으로 명시적형변환
//        2. long형을 int형으로 명시적 형변환
//        3. short 형 데이터끼리의 연산.

        double pi = 3.14;
        System.out.println((int)pi);
        long num1 = 1234567890;
        System.out.println((int)num1);
        short num2 = 10;
        short num3 = 20;
        System.out.println((short)num2+num3);
    }
}
