public class Ex6_4 {
    public static void main(String args[]){

        WorkDay workDay = new WorkDay();
        String today = workDay.workDay("일");

        System.out.println("오늘은 " + today + "입니다");
    }
}

class WorkDay{
    String workDay(String day){
        String result = null;

        if(day.equals("월")||day.equals("화")||day.equals("수")||day.equals("목")||day.equals("금")){
            result = "출근하는 날";
        } else if (day.equals("토")||(day.equals("일"))) {
            result = "쉬는 날";
        }
        return result;
    }
}
