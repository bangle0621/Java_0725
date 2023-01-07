package com.test.java;

public class Fighter implements Fightable{

    @Override
    public void move(int x, int y) {
        System.out.println("가로로 " + x + "만큼, 세로로 " + y + "만큼 움직인다.");
    }

    @Override
    public void attack(Fightable f) {
        System.out.println("때린다");
    }

    Fightable fi = new Fighter();


}
