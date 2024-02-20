import java.util.*;        
class BankAccount
{
    private int balance;            

    public BankAccount(int balance)
    {
        this.balance = balance;
    }

    public int balance()
    {
        return balance;
    }

    public void deposit(int amt)
    {
        if (amt > 0)
        {
            balance = balance + amt;
            System.out.println("Deposit of Rs " + amt + " successful");
        } 
        else 
        {
            System.out.println("Please choose a number above 0");
        }
    }

    public void withdraw(int amt)
    {
        if (amt > 0 && amt <= balance)
        {
            System.out.println("Withdraw successfull of "+amt+" Rs");
            balance = balance-amt; 
        } 
        else 
        {
            System.out.println("Insuffucient balance");
        }
    }
}

class ATM{

    private BankAccount account; 
    public ATM(BankAccount account)
    {
        this.account = account;
    }

    public void display()
    {
        System.out.println("Select Options");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void execute()
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        do
        {
            display();
            System.out.println("Enter Your Choice:");
            ch = sc.nextInt();     
            switch (ch)
            {
                case 1:
                    System.out.println("Enter amount to deposit : ");
                    int depositAmount = sc.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw : ");
                    int withdrawAmount = sc.nextInt();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance " + account.balance());
                    break;
                case 4:
                    System.out.println("Thanks for visiting");
                    break;
                default:
                    System.out.println("Invalid Choice");   
            }
        }while (ch != 4);
    }
}

public class ATMInterface 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(30000);
        ATM atm = new ATM(userAccount);
        System.out.println("*****WELCOME TO ATM*****");
        System.out.println("Enter your PIN : ");
        String pin = sc.nextLine();
        if (pin.equals("1234")) 
        {                                  
            atm.execute();
        } 
        else 
        {
            System.out.println("Wrong pin... Enter valid pin ! "); 
        }
    }               
}                              