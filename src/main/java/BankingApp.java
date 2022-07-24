import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        boolean exit = false; //status kliknięcia wyjścia
        boolean block = false; //bug fix, aby móc przejść z pierwszego ekranu do wyjścia
        boolean loginstatus = false;  //status "czy jest zalogowany?
        do {
            Scanner scanner = new Scanner(System.in);//zdefiniowanie skanowania
            AccountDetails account = new AccountDetails();
            do {
                System.out.println("Hello in our bank\n" +
                        //"1. Login\n" +
                        "2. Create new acount\n" +
                        "3. Exit");
                int z = scanner.nextInt();
                switch (z) {
                    case 1:
                        String inputlogin;
                        System.out.println("enter your login");
                        inputlogin = scanner.next();
                        /*if (inputlogin == login) {
                            x = true;
                        } else {
                            System.out.println("there is no user with this login");
                        }*/

                        break;
                    case 2:
                        account.createAccount();
                        loginstatus = true;
                        exit = false;
                        break;
                    case 3:
                        exit = true;
                        block = true;
                        break;
                }
            } while (loginstatus == false & exit == false);
            int inputNumber;
            if (block == false) {
                do {
                    System.out.println("\nWhat do you want to do?\n" +
                            "1. Show account info\n" +
                            "2. Cash deposit\n" +
                            "3. Cash withdrawal\n" +
                            "4. Log out\n" +
                            "5. Exit");
                    inputNumber = scanner.nextInt();
                    switch (inputNumber) {
                        case 1:
                            account.showAccount();
                            break;
                        case 2:
                            account.cashin();
                            break;
                        case 3:
                            account.cashout();
                            break;
                        case 4:
                            loginstatus = false;
                            break;
                        case 5:
                            exit = true;
                            break;
                    }
                }while (inputNumber != 5 & inputNumber != 4);
            }

        }
        while (exit == false);
    }
}

