import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        boolean loginstatus;
        boolean exit = false; //status kliknięcia wyjścia
        Scanner scanner = new Scanner(System.in);//zdefiniowanie skanowania
        AccountDetails account = new AccountDetails();
        do {
            do {
                loginstatus = false;
                System.out.println("""
                        Hello in our bank
                        1. Login
                        2. Create new acount
                        3. Exit""");
                int z = scanner.nextInt();
                switch (z) {
                    case 1 -> {
                        account.loginIntoExistingAcc();
                        loginstatus = account.loggedStatus;
                        if (loginstatus) {
                            System.out.println("logging in succesfull");
                            account.DownloadUserData();
                        }
                        else
                        {
                            System.out.println("bad account number or login do not match");
                        }
                    }
                    case 2 -> {
                        account.createAccount();
                        account.UpdateUserData();
                        loginstatus = true;
                    }
                    case 3 -> {
                        exit = true;
                        loginstatus = true;
                    }
                }
            }while(!loginstatus);
            if(!exit)
            {
                    do {
                        int inputNumber;
                        System.out.println("""

                                What do you want to do?
                                1. Show account info
                                2. Cash deposit
                                3. Cash withdrawal
                                4. Log out
                                5. Exit""");
                        inputNumber = scanner.nextInt();
                        switch (inputNumber) {
                            case 1 -> account.showAccount();
                            case 2 -> {
                                account.cashin();
                                account.UpdateUserData();
                            }
                            case 3 -> {
                                account.cashout();
                                account.UpdateUserData();
                            }
                            case 4 -> {
                                account.UpdateUserData();
                                loginstatus = false;
                            }
                            case 5 -> exit = true;
                        }

                    } while (loginstatus);
                }
        } while (!exit);
    }
}

