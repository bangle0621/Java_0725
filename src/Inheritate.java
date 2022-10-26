public class Inheritate {
    public static void main(String args[]) {
        Point p = new Point();

        System.out.println(p.c.x);
        System.out.println(p.z);
    }
}

class Circle{
    String x = "s";
    String y = "아";
}

class Point{
    String z = "그래";
    Circle c = new Circle();
}
