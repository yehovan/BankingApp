import java.util.Scanner;

public class AccountDetails {
    private String name;
    private String accountNumber;
    private String login;
    private long balance;
    Scanner scanner = new Scanner(System.in);
    public void createAccount(){
        System.out.println("enter your account number:");
        accountNumber = scanner.next();
        System.out.println("enter your account name");
        name = scanner.next();
        System.out.println("enter login");
        login = scanner.next();
        balance = 0;
    }
    public void cashin(){
        long deposit = 0;
        System.out.println("enter amount of money you want to deposit");
        deposit = scanner.nextLong();
        balance = balance + deposit;
    }
    public void cashout(){
        long amount = 0;
        System.out.println("enter amount of money you want to withdraw");
        amount = scanner.nextLong();
        if(balance<amount){
            System.out.println("Insufficient funds");
        }
        else{
            balance = balance - amount;
            System.out.println("Take your cash");
        }
    }

    public void showAccount() {
        System.out.println("Your account name is " + name +
                "\nYour account number is " + accountNumber +
                "\nYour login is "+ login +
                "\nYour balance is " + balance);
    }

    }

