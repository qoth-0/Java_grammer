package C14Interface.BankService;

import java.util.Scanner;

public class BankController {
//    사용자 요청 처리
    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            System.out.println("계좌번호를 입력해주세요.");
            String account = sc.nextLine();
            BankAccount ba = new BankAccount(account);
        while(true) {
            System.out.println("사용할 서비스 선택 1.카드 2.카페이");
            int service = sc.nextInt();
            System.out.println("1.입금 2.출금");
            int choice = sc.nextInt();
            switch (service) {
                case 1:
                    BankService bankCard = new BankCardService();
                    if(choice == 1) {
                        System.out.println("얼마를 입금하겠습니까?");
                        int in = sc.nextInt();
                        bankCard.deposit(ba, in);
                        System.out.println(ba.getBalance());
                    }else {
                        System.out.println("얼마를 출금하겠습니까?");
                        int out = sc.nextInt();
                        bankCard.withdraw(ba, out);
                        System.out.println(ba.getBalance());
                    }
                    break;
                case 2:
                    BankService bankKapay = new BankKapayService();
                    if(choice == 1) {
                        System.out.println("얼마를 입금하겠습니까?");
                        int in = sc.nextInt();
                        bankKapay.deposit(ba, in);
                        System.out.println(ba.getBalance());
                    }else {
                        System.out.println("얼마를 출금하겠습니까?");
                        int out = sc.nextInt();
                        bankKapay.withdraw(ba, out);
                        System.out.println(ba.getBalance());
                    }
                    break;

            }
        }


//        if(service == 1) {
//            BankService bk = new BankKapayService();
//            bk.deposit();
//        }else if(service == 2) {
//            BankService bc = new BankCardService();
//            bc.deposit();
//        }


    }

}
