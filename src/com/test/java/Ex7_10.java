package com.test.java;

public class Ex7_10 {
    public static void main(String args[]){

        TransPort[] tp = {new Car2(), new Bycicle()};

        for(int i =0;i<tp.length;i++) {
            tp[i].move(100, 500);
            tp[i].stop();
        }

    }
}

abstract class TransPort{
    abstract void move(int x, int y);
    void stop(){
        System.out.println("멈추었습니다.");
    }
}

class Car2 extends TransPort{
    @Override
    void move(int x, int y) {
        System.out.println("차가 가로 "+ x + " 만큼, 세로 " + y + " 만큼 이동하였습니다.");
    }
    void openDoor(){
        System.out.println("차 문을 닫습니다.");
    }
}

class Bycicle extends TransPort{
    @Override
    void move(int x, int y) {
        System.out.println("자전거가 가로 " + x + "만큼, 세로 " + y + " 만큼 이동하였습니다.");
    }
    void selfControl(){
        System.out.println("직접 움직입니다.");
    }
}