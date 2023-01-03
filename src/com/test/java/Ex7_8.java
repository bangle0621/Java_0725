package com.test.java;

public class Ex7_8 {
    public static void main(String[] args){

        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());
        b.summary();

        System.out.println("현재 남은 돈은 "+ b.money+" 입니다.");
        System.out.println("현재 남은 보너스 포인트는 " + b.bonusPoint + " 입니다.");


    }
}

class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        this.bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product{

    Tv() {
        super(100);
    }
    public String toString() {return"TV";}
}

class Computer extends Product{
    Computer(){
        super(200);
    }

    public String toString() {return "Computer";}
}

class Buyer{
    int money = 1000;
    int bonusPoint = 0;
    int i = 0;
    Product[] cart = new Product[10];
    void buy(Product p){
        if(money < p.price){
            System.out.println("돈이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i] = p;
        i++;
    }

    void summary(){
        int sum = 0;
        String itemList = "";

        for(int i=0; i< cart.length; i++){
            if(cart[i] == null) break;
            sum += cart[i].price;
            itemList += cart[i].toString() + ", ";
        }
        System.out.println("구입하신 금액은 "+ sum +"입니다.");
        System.out.println("구입하신 목록은 " + itemList + "입니다.");
    }
}