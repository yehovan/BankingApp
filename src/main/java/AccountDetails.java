import java.util.Scanner;
public class AccountDetails {
    boolean loggedStatus;//status zalogowania
    int Lp = 0; //liczba zarejestrowanych użytkowników
    String name; //podręczna pamięć nazwy
    String namemem[] = new String[99]; //baza nazw
    int accountNumber; //podręczna pamięć numeru konta
    int accountNumbermem[] = new int[99]; //baza numerów konta
    String login; //podręczna pamięć loginów
    String loginmem[] = new String[99];//baza loginów
    double balance;//podręczna pamięć salda
    double balancemem[] = new double[99];//baza sald
    Scanner scanner = new Scanner(System.in);//funkcja skanera

        public void createAccount(){
            System.out.println("enter your account name");
            name = scanner.next();
            System.out.println("enter login");
            login = scanner.next();
            accountNumber = Lp+1;
            accountNumbermem[Lp] = accountNumber;
            balancemem[Lp] = 0;
            namemem[Lp] = name;
            loginmem[Lp] = login;
            loggedStatus = true;
            ++Lp;
        }
    public void loginIntoExistingAcc() {
        System.out.println("enter your account number");
        accountNumber = scanner.nextInt();
        System.out.println("enter your login");
        login = scanner.next();
       if((accountNumber == accountNumbermem[accountNumber-1])&( login == loginmem[accountNumber-1]))
       {
            name = namemem[accountNumber-1];
            balance = balancemem[accountNumber-1];
            loggedStatus = true;
        }
        else{
            System.out.println("wrong login or account number, please try again");
            loggedStatus = false;
        }
    }
    public void cashin(){
        long deposit = 0;
        System.out.println("enter amount of money you want to deposit");
        deposit = scanner.nextLong();
        balance = balance + deposit;
    }
    public void UpdateUserData(){
            accountNumbermem[accountNumber-1] = accountNumber;
            namemem[accountNumber-1] = name;
            loginmem[accountNumber-1] = login;
            balancemem[accountNumber-1] = balance;
        System.out.println("updating complete");
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

