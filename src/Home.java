public class Home {
    String window = "반창";
    String door = "나무문";
    String floor = "마루";
}

class BedRoom extends Home{
    String Bed = "싱글";
    String stand = "협탁용";
}

class BedHouse {
    String window = "반창";
    String door = "나무문";
    String floor = "마루";
    String Bed = "싱글";
    String stand = "협탁용";
}

class Main{
    public static void main(String args[]){
        Home h = new Home();
        BedRoom b = new BedRoom();
        BedHouse bh = new BedHouse();

        h.window = "전창";
        System.out.println("h.window : "+ h.window);
        System.out.println("b.window : " + b.window);
        System.out.println("dh.window : " + bh.window);

        b.window = "큰창";
        System.out.println("h.window : "+ h.window);
        System.out.println("b.window : " + b.window);
        System.out.println("bh.window : " + bh.window);

        bh.window = "유리창";
        System.out.println("h.window : " + h.window);
        System.out.println("b.window : " + b.window);
        System.out.println("bh.window : " + bh.window);
    }
}