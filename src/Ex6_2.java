public class Ex6_2 {

    public static void main(String args[]){
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1은 "+t1.channel);
        System.out.println("t2은 " +t2.channel);

        t1.channel = 7;
        System.out.println("t1은 7로 변경 : "+t1.channel);

        t2 = t1;
        System.out.println("t1은 7이다.: "+t1.channel);
        System.out.println("t2는 몇인가: "+ t2.channel);
    }
}
