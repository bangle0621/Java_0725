package DoIt.Chater01;

public class q104 {
    public static void main(String[] args) {
        System.out.println("mid3(3,2,1) = " + mid3(3,2,1));
        System.out.println("mid3(3,2,2) = " + mid3(3,2,2));
        System.out.println("mid3(3,1,2) = " + mid3(3,1,2));
        System.out.println("mid3(3,2,3) = " + mid3(3,2,3));
        System.out.println("mid3(2,1,3) = " + mid3(2,1,3));
        System.out.println("mid3(3,3,2) = " + mid3(3,3,2));
        System.out.println("mid3(3,3,3) = " + mid3(3,3,3));
        System.out.println("mid3(2,2,3) = " + mid3(2,2,3));
        System.out.println("mid3(2,3,1) = " + mid3(2,3,1));
        System.out.println("mid3(2,3,2) = " + mid3(2,3,2));
        System.out.println("mid3(1,3,2) = " + mid3(1,3,2));
        System.out.println("mid3(2,3,3) = " + mid3(2,3,3));
        System.out.println("mid3(1,2,3) = " + mid3(1,2,3));

    }
    static int mid3(int a, int b, int c){
        if(a >= b){
            //a > b > c
            if(b >= c) return b;
            //c > a > b
            else if ( c >= a) return a;
            //a > c > b
            else return c;
        //b > a > c
        } else if (a > c) return a;
        //b > c > a
        else if(b > c) return c;
        //c > b > a
        else return b;
    }
}
