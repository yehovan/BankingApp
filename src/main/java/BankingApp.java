import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//zdefiniowanie skanowania
        System.out.println("Witaj w naszej aplikacji bankowej");
        int inputNumber;
        do{
            System.out.println("\nCo chcesz zrobic?\n" +
                    "1. informacje o koncie\n" +
                    "2. Wplata gotowki\n" +
                    "3. Wyplata gotowki\n" +
                    "4. Wyjscie");
            inputNumber = scanner.nextInt();
            switch(inputNumber){
                case 1:
                    System.out.println("działa 1 case");
                    break;
                case 2:
                    System.out.println("działa 2 case");
                    break;
                case 3:
                    System.out.println("działa 3 case");
            }
        }while(inputNumber != 4);

    }


}
