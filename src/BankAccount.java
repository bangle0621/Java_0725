public class BankAccount {

    //변수 선언
    int myBalance=0;

    //수입
    public int deposit(int account){
        System.out.println("수입 : "+account);
        myBalance += account;
        return myBalance;
    }


    //지출
    public int withdraw(int account){
        System.out.println("지출 : "+account);
        myBalance -= account;
        return myBalance;
    }
    //잔액
    public int checkMyBalance(){
        System.out.println("잔액: "+myBalance);
        return myBalance;
    }
}
