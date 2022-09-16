public class Ex_6_10 {


    public static void main(String args[]){

        Day d = new Day();

        d.day("월");
        d.day(15);



    }


}

class Day{
    void day(String day){
        System.out.println("오늘은 "+ day+ "요일이야.");
    }

    void day(int day){
        System.out.println("오늘은 "+ day + "일이야");
    }
}

