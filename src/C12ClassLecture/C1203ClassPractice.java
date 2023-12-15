package C12ClassLecture;

public class C1203ClassPractice {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        BankAccount ba1 = new BankAccount(1234);
//        잔액확인
        ba.setAccount_number(1111111);
        ba.setBalance(50000);
        ba.getBalance();





    }
}

//          실습
//        클래스명:BankAccount
//        객체변수 : 계좌번호(account_number),balance(잔고,int)
//        -계좌번호 setter,잔고 setter(선택)
//        메소드: 예금(deposit),인출(withdraw)
//        1-1)deposit에 잔액이 충분해야 인출 메소드
//        1-2)잔액 얼마 남았는지 확인하는 메소드
//        1-3)예금

class BankAccount {
    private  int account_number;
    private  int balance;

    BankAccount() {

    }

    BankAccount(int account_number) {
        this.account_number = account_number;

    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void withdraw(int money) {

        if(getBalance() > money) {

        }
    }

}
