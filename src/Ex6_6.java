public class Ex6_6 {

    public static void main(String args[]){
        Val v = new Val();
        v.x = 10;

        System.out.println("x값은 : "+ v.x);
        Change c = new Change();
        c.change(v.x);

        System.out.println("바뀐뒤의 x값은");
        System.out.println("답 : "+ v.x);

    }
}
class Val{
    int x;
}

class Change{
   void change(int x){
       x = 1000;
       System.out.println("x값은 :"+x);
   }
}
