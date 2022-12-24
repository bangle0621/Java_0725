package pck1;

public class Parent {
    public int pub;
           int def;
    protected int prt;
    private int pri;

    void test(){
        System.out.println(pub);
        System.out.println(def);
        System.out.println(prt);
        System.out.println(pri);
    }
}

class ParentTest{
    public static void main(String args[]){
        Parent p = new Parent();

        System.out.println(p.pub);
        System.out.println(p.def);
        System.out.println(p.prt);
//        System.out.println(p.pri);  private 동일한 클래스만 접근 가능
    }

}
