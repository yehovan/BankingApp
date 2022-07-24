import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//zdefiniowanie skanowania
        AccountDetails account = new AccountDetails();
        boolean x = false; //status "czy jest zalogowany?
        do {
            System.out.println("Hello in our bank\n" +
                    "1. Login\n" +
                    "2. Create new acount");
            int z = scanner.nextInt();
            switch(z){
                case 1:
                    System.out.println("przejście do okna logowania");
                    break;
                case 2:
                    account.createAccount();
                    x = true;
                    break;
            }
        }while(x==false);
        int inputNumber;
        do{
            System.out.println("\nWhat do you want to do?\n" +
                    "1. Show account info\n" +
                    "2. Cash deposit\n" +
                    "3. Cash withdrawal\n" +
                    "4. Exit");
            inputNumber = scanner.nextInt();
            switch(inputNumber){
                case 1:
                    account.showAccount();
                    break;
                case 2:
                    account.cashin();
                    break;
                case 3:
                    account.cashout();
                    break;
            }
        }while(inputNumber != 4);

    }


}
