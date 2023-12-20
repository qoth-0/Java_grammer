package C14Interface.BankService;

public class BankAccount{
     private String account_number;
     private int balance; // 잔액

    BankAccount(String AccountNumber){
        this.account_number = AccountNumber;
    }



    public String getAccount_number() {
        return account_number;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int a) {
        this.balance = a;
    }

    public void getmoney(int a){
        this.balance += a;
        System.out.println("입금 후 잔액 "+balance+"원");
    }
}