package pck2;

import pck1.Parent;

public class Parent2 extends Parent {
    void test(){
        System.out.println(pub);
//        System.out.println(def);    //default 같은 패키지 내에서만 가능
        System.out.println(prt);    //protected 자손 클래스에서 사용 가능
//        System.out.println(pri);    //private 같은 클래스 내에서만 가능
    }

}

public class Parent3{
    public static void main(String args[]){
    Parent p = new Parent();
    System.out.println(p.pub);  //public 전체
//    System.out.println(p.def);  //동일 패키지
//    System.out.println(p.prt); //protected 자손클래스
//        System.out.println(p.pri);  private 동일한 클래스만 접근 가능

    }
}
