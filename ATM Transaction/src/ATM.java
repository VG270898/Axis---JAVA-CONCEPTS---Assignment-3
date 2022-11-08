import java.util.ArrayList;
import java.util.Scanner;
public class ATM {
    long amount;
    long balance=12000;
    int pin=1234;
    ArrayList transaction = new ArrayList();

    boolean validatePin(int atmPin){
        if(pin==atmPin){
            return true;
        }
        else {
            return false;
        }
    }

    void balance(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Final Balance is : " + balance);
    }

    void deposit(long amount){
        balance+=amount;
        System.out.println("Amount " + amount + " is deposited successfully");
        System.out.println("Final Balance is : " + balance);
        transaction.add(("Credited : "+ amount));
    }

    void withdrawl(long amount){
        balance-=amount;
        System.out.println("Amount " + amount + " is debited");
        System.out.println("Final Balance is : " + balance);
        transaction.add(("Debited : "+ amount));

    }

    void transactions(){
        System.out.println(transaction);
    }

    public static void main(String[] args){
        ATM customer1 = new ATM();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t\t********Welcome to Axis Bank ATM*******");
        System.out.print("Enter ATM Pin : ");
        int pin  = scanner.nextInt();
        if(customer1.validatePin(pin)){
            while (true){
                System.out.println("Choose the options...");
                System.out.println("1 to Deposit Money");
                System.out.println("2 to Withdraw Money");
                System.out.println("3 to Check Balance");
                System.out.println("4 to See Last Transactions");
                System.out.println("5 to Exit");

                System.out.print("Enter your choice : ");
                int options = scanner.nextInt();
                switch (options){
                    case 1:
                        System.out.print("Enter Amount to Deposit : ");
                        long amountDeposit = scanner.nextLong();
                        customer1.deposit(amountDeposit);
                        break;
                    case 2:
                        System.out.print("Enter Amount to Withdraw : ");
                        long amountWithdraw = scanner.nextLong();
                        customer1.withdrawl(amountWithdraw);
                        break;
                    case 3:
                        customer1.balance();
                        break;
                    case 4:
                        customer1.transactions();
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Enter Correct option...");

                }
            }
        }


        else{
            System.out.println("Sorry! Enter Correct PIN");
        }

    }
}
