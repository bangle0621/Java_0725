import java.time.LocalDate;

public class method {

    static int price = 10000;  //기존 금액
//    static int resPrice;

    static int resIncome;
    static int resOutcome;

    public static void main(String args[]) {

        //가계부


        //오늘의 날짜
        System.out.println("오늘의 날짜: "+today());
        //기존 잔액
        System.out.println("기존 잔액 :"+ price);
        //수입
//        System.out.println("오늘의 수입: "+income(3000));
        System.out.println("오늘의 수입: "+income(3000));
        //지출
        System.out.println("오늘의 지출 포함 잔액: "+ outcome(5000));

        //합계
        System.out.println("오늘의 잔액 :"+ resPrice());
    }

    //오늘의 날짜
    public static LocalDate today() {
        LocalDate day = LocalDate.now();
        return day;
    }

    //수입
    public static int income(int inprice){

        resIncome += inprice;
        return resIncome;
    }

    public static int outcome(int outprice){

        resOutcome += outprice;

        return resOutcome;
    }

    public static int resPrice(){
        int resPrice = price + resIncome - resOutcome;

        return resPrice;
    }

}
