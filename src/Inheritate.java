public class Inheritate {
    public static void main(String args[]) {
        Point p = new Point();

        System.out.println(p.c.x);
        System.out.println(p.z);
    }
}

class Circle{
    String x = "s";
    String y = "์";
}

class Point{
    String z = "๊ทธ๋";
    Circle c = new Circle();
}
