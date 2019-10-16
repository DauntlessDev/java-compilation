import java.util.Scanner;
public class ATM {
    public static void main(String args[] ){ 
        {
		Scanner keyboard = new Scanner(System.in);
                Scanner input = new Scanner(System.in);
		int pin = 12345; int n, i;
                String user;

		System.out.println("BDO");
                System.out.print("Account Number:");
                Scanner in = new Scanner(System.in);
                n = in.nextInt();
		System.out.print("PIN: ");
		int entry = keyboard.nextInt();
              
		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED\n");
               
	}
        int balance = 00000, withdraw, deposit = 0;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("ATM");
            System.out.println("[1] INQUIRY");
            System.out.println("[2] DEPOSIT");
            System.out.println("[3] WITHDRAW");
            System.out.println("[4] for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
            {
                int user = 12345;
                System.out.println("Account Number: "+ user );
            System.out.print("Balance:" + balance);
                    System.out.println("\n");
            }
            
                   
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:");
                 deposit = s.nextInt();
                 
                 if (deposit < 5000)
                   {
                       System.out.print("Maintaining Balance not met");
                              
                   }
                 else
                     
             
                System.out.println("Your Money has been successfully deposited");
                balance = balance + deposit;
           System.out.println("");
                break;
 
                case 3:
               System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw - 10;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("\n");
                break;
 
                case 4:
                System.exit(0);
            }
        }
    }
}
