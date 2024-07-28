import java.util.Scanner;

public class bankingApplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount bank1 = new BankAccount("Shital", "01");
        bank1.showMenu();
    }
  
}
  class BankAccount{
      int balance;
      int previousTransaction;

      String customerName;
      String CustomerId;

      BankAccount(String cname, String cid){
        this.customerName = cname;
        this.CustomerId = cid;
      }
      
      void deposit(int amount){
        if(amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
      }
      
      void Withdraw(int amount){
        if(amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
      }

      void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited: "+ previousTransaction);
        
        }
        else if(previousTransaction < 0 ){
            System.out.println("Withdraw: "+ Math.abs(previousTransaction));
        }
        else{
            System.out.println("No transaction is occured!");
            
        }
    }
    void showMenu(){
        char option = '\0';
        char newVar ='\0';

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome "+customerName);
        System.out.println("your ID is "+ CustomerId);
        System.out.println();
        System.out.println("A. Check balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");


        
        do{
            System.out.println("======================");
            System.out.println("Enter the option");
            System.out.println("=====================");
            option = sc.next().charAt(0);
            newVar = Character.toUpperCase(option);
           
            switch (newVar){
                case 'A':
                System.out.println("===============");
                System.out.println("Balance is: "+balance);
                System.out.println("=======================");
               System.out.println();
               break;

               case 'B':
               System.out.println("===============");
                System.out.println("Enter the amount to deposit");
                System.out.println("=======================");
                int amount = sc.nextInt();
                deposit(amount);
               System.out.println();
             break;

             case 'C':
             System.out.println("===============");
                System.out.println("Enter the amount to withdraw");
                System.out.println("=======================");
                int amount2 = sc.nextInt();
                Withdraw(amount2);
               System.out.println();
               break;

               case 'D':
               System.out.println("===============");
               getPreviousTransaction();
            System.out.println("=======================");
             System.out.println();
               break;


               case 'E':
               System.out.println("======================");
               break;

               default:
               System.out.println("Invalid Option! Please try again");


            }

        }while(newVar != 'E');
    }
      }
    