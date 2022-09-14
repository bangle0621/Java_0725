class Ex6_3 {

    public static void main(String args[]){
        Card c1 = new Card();
        Card c2 = new Card();

        c1.num = 1;
        c1.kind = "Spade";

        c2.num = 4;
        c2.kind = "Heart";

        System.out.println("Card.width = "+ Card.width);
        System.out.println("Card.height = "+ Card.height);
        System.out.println("c1은 "+ c1.kind+ ","+ c2.num +" 이며, 크기는 ("+ c1.width +"," + c1.height + ") 이다" );
        System.out.println("c1은 "+ c1.kind+ ","+ c2.num +" 이며, 크기는 ("+ c1.width +"," + c1.height + ") 이다" );

        c1.width = 50;
        c1.height = 80;
        System.out.println("c1의 width와 height 를 각각 50,80으로 변경합니다");
        System.out.println("c1은 "+ c1.kind+ ","+ c2.num +" 이며, 크기는 ("+ c1.width +"," + c1.height + ") 이다" );
        System.out.println("c1은 "+ c1.kind+ ","+ c2.num +" 이며, 크기는 ("+ c1.width +"," + c1.height + ") 이다" );

        System.out.println("참조변수에 해당하는 인스턴스 변수값을 바꿨다고 생각할 수 있지만, 이는 클래스 변수의 변수 값이 바뀐것이다. 이러한 표기는 오해를 불러 일으킬 수 있기에 지양하고, 클래스를 사용하여 변수를 사용해준다.");
        Card.width = 140;
        Card.height = 370;
        System.out.println("Card의 width와 height 를 각각 140,370으로 변경합니다");
        System.out.println("c1은 "+ c1.kind+ ","+ c2.num +" 이며, 크기는 ("+ c1.width +"," + c1.height + ") 이다" );
        System.out.println("c1은 "+ c1.kind+ ","+ c2.num +" 이며, 크기는 ("+ c1.width +"," + c1.height + ") 이다" );

    }
}

class Card {
    int num;
    String kind;

    static int width = 200;
    static int height = 300;
}
