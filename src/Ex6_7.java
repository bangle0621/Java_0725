import org.w3c.dom.ls.LSOutput;

class Val2{
    int x;
}

class Ex6_7 {

    public static void main(String args[]){


        Val2 d = new Val2();
        d.x = 10;
        System.out.println("d.x의 값은 : "+d.x);

        change(d);
        System.out.println("d.x의 값은 : "+d.x);

    }

    static void change(Val2 d){
        d.x = 1000;
    }

}
