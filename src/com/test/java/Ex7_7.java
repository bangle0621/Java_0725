package com.test.java;

public class Ex7_7 {
    public static void main(String[] args){

        Car c = new FireEngine();
        c.color = "red";
        c.drive();
        c.stop();
//        c.water();

//        FireEngine fe = new Car();
        FireEngine fe = (FireEngine) c;

        fe.color = "blue";
        fe.water();
        fe.stop();
        fe.drive();

        Car c2 = null;
        c2 = fe;    //자동 형변환 가능. 사용 멤버수가 감소하는 것이기 때문에
    }
}

class Car{
    String color;

    void drive(){
        System.out.println("달린다");
    }
    void stop(){
        System.out.println("멈춘다.");
    }
}

class FireEngine extends Car{
    void water(){
        System.out.println("물을 붙는다");
    }
}
