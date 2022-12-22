public class Ex7_3 {
    public static void main(String args[]){
        Child c = new Child();
        c.method();

        Child2 c2 = new Child2();
        c2.method();
    }
}
class Parent {
    int x = 10;

}
class Child extends Parent{
    int x = 20;

    void method(){
        System.out.println("x : "+x);
        System.out.println("this.x : "+ this.x);
        System.out.println("super.x :" + super.x);
    }
}
class Parent2{
    int x = 30;
}
class Child2 extends Parent2{
    void method(){
        System.out.println("x : "+x);
        System.out.println("this.x :"+ this.x);
        System.out.println("super.x :" + super.x);
    }
}

class Pointa{
    int x;
    int y;
    Pointa(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Pointa3D extends Pointa{
    int z;
    Pointa3D(int x, int y, int z){
        super(x,y);
//        this.x = x;
//        this.y = y;
        this.z = z;
    }
}