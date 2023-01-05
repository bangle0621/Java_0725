package com.test.java;

public class Ex7_11 {
    public static void main(String args[]){
    
        Cooking c = new Cooking();
        c.boiling("김치찌개");
        c.hitting();
    }
}


class Cooking implements Cook {

    String todayMenu = "돼지고기";

    @Override
    public void boiling(String todayMenu) {
        System.out.println("오늘의 메뉴는 " + todayMenu + "입니다.");
    }

    @Override
    public void hitting() {
        System.out.println("음식이 따듯합니다.맛있게 드세요");
    }
}
