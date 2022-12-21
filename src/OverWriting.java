public class OverWriting extends School{

   public static void main(String args[]){
       CheckOver co = new CheckOver();

       co.needChair(3,12);
   }
}

class School{
    int room;
    int chair;

    String needChair(int room, int chair){
        System.out.println("필요한 교실 수 :"+ room);
        System.out.println("필요한 의자 수 : "+ room * chair);
        int needChair = room * chair;

        return "필요한 의자 수 :"+ needChair;
    }
}
class CheckOver extends School{
    @Override
    String needChair(int room, int chair) {

        int student = 20;
        System.out.println("한 학급의 학생 수 :"+ student);
        return super.needChair(room, chair);
    }
}