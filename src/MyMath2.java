public class MyMath2 {
    int a;          //인스턴스 변수
    int b;          //인스턴스 변수

    MyMath2(int a, int b){    //생성자. 생성자 메서드. a,b 는 지역 변수
        this.a = a;     //인스턴스 변수 a = 지역변수 a
        this.b = b;     //this.b는 인스턴스 변수. b는 지역변수
    }

    long add(){     //지역변수 없음
        return a+b;     //인스턴스 변수. 지역변수 없으니 구분 안해도 됨. this 생략 가능
    }

    static long add(int a, int b){      //클래스 메서드. 클래스 메서드는 참조변수(객체) 사용 불가. this는 참조변수. 따라서 사용불가
        return a + b;                   //둘 다 지역변수
    }
}
