package C14Interface.BankService;

public class BankKapayService implements BankService{
    @Override
    public void deposit(BankAccount ba,int a) {
        ba.setBalance(ba.getBalance() + a);
        System.out.println("카페이로 " + a + "원 입금되었습니다.");
    }

    @Override
    public void withdraw(BankAccount ba, int a) {
        if(ba.getBalance() < a) {
            System.out.println("잔액이 부족합니다.");
        }
        else {
            ba.setBalance(ba.getBalance() - a);
            System.out.println("카페이로 " + a + "원 출금되었습니다.");
        }

    }

}
