package piashraful.atm;

import java.util.Scanner;

class ATM{
    float balance;
    int pin = 12345;

    ATM(){
       checkPin();
    }
    public void checkPin(){
        System.out.println("Enter your PIN");
        Scanner scanner = new Scanner(System.in);
        int enteredPin = scanner.nextInt();
        if(enteredPin==pin){
            menu();
        }else {
            System.out.println("Enter a valid PIN");
            checkPin();
        }
    }


    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Check A/C Balance:  ");
        System.out.println("2. Withdraw Money: ");
        System.out.println("3. Deposit Money: ");
        System.out.println("4. Exit: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if(option == 1){
            checkBalance();
        }else if(option == 2){
            withdrawMoney();
        }else if(option == 3){
            depositMoney();
        }else if(option ==4){
            return;
        }else {
            System.out.println("Enter valid choice!!!");
        }
    }

    public void checkBalance(){
        System.out.println("Balance is: "+balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter your balance: ");
        Scanner scanner = new Scanner(System.in);
        float amount = scanner.nextFloat();
        if(amount > balance){
            System.out.println("Insufficient fund!!");
        }else {
            balance = balance - amount;
            System.out.println("Money of amount "+ amount + " withdrawn successfully" );

        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter amount to be deposited: ");
        Scanner scanner = new Scanner(System.in);
        float amount =  scanner.nextFloat();
        balance = balance + amount;
        System.out.println("New amount is " +amount);
        menu();
    }


}


public class ATMMachine {
    public static void main(String[] args) {
        ATM atm = new ATM();

    }
}
