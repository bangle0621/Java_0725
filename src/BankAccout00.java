public class BankAccout00 {
    public static void main(String args[]){

        BankAccount res1 = new BankAccount();
        BankAccount res2 = new BankAccount();

        //수입
        res1.deposit(3000);
        res2.deposit(5000);

        //지출
        res1.withdraw(1000);
        res2.withdraw(1000);

        //잔액
        res1.checkMyBalance();
        res2.checkMyBalance();
    }
}
