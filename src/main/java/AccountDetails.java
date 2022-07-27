import java.util.Scanner;
public class AccountDetails {
    boolean loggedStatus = false;//status zalogowania
    int Lp = 0; //liczba zarejestrowanych użytkowników
    String name; //podręczna pamięć nazwy
    String[] namemem = new String[99]; //baza nazw
    int accountNumber; //podręczna pamięć numeru konta
    int[] accountNumbermem = new int[99]; //baza numerów konta
    String login; //podręczna pamięć loginów
    String[] loginmem = new String[99];//baza loginów
    double balance;//podręczna pamięć salda
    double[] balancemem = new double[99];//baza sald
    Scanner scanner = new Scanner(System.in);//funkcja skanera
        public void createAccount(){
            System.out.println("enter your account name");
            name = scanner.next();
            System.out.println("enter login");
            login = scanner.next();
            accountNumber = Lp+1;
            accountNumbermem[accountNumber-1] = accountNumber;
            balance = 0;
            ++Lp;
        }
    public void loginIntoExistingAcc() {
        System.out.println("enter your account number");
        accountNumber = scanner.nextInt();
        System.out.println("enter your login");
        login = (scanner.next());
        //memorycheck
            for (int z = 0; z < 99; z++)
            {
                if ((login.equals(loginmem[z]))&(login.equals(loginmem[accountNumber-1])))
                {
                    loggedStatus = true;
                    break;
                }
                else
                {
                    loggedStatus = false;
                }
            }
    }
    public void cashin(){
        long deposit;
        System.out.println("enter amount of money you want to deposit");
        deposit = scanner.nextLong();
        balance = balance + deposit;
    }
    public void DownloadUserData()
    {
        accountNumber = accountNumbermem[accountNumber-1];
        name = namemem[accountNumber-1];
        login = loginmem[accountNumber-1];
        balance = balancemem[accountNumber-1];
        System.out.println("hello "+name);
    }
    public void UpdateUserData(){
            accountNumbermem[accountNumber-1] = accountNumber;
            namemem[accountNumber-1] = name;
            loginmem[accountNumber-1] = login;
            balancemem[accountNumber-1] = balance;
        System.out.println("update complete");
    }
    public void cashout(){
        long amount;
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

