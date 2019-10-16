import java.util.Scanner;
public class BankInterest {
 
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in); 

       double bbalance, annual, monthly, daily, i=0 , j=0,k=0, yr=10, rate;
       System.out.print("Input the bank amount balance: ");
       bbalance= in.nextDouble();
       System.out.print("Input the rate: ");
       rate= in.nextDouble();

       annual = bbalance;
       monthly = bbalance;
       daily= bbalance;
       
       rate = rate/100;
       double monthlyrate = rate/12;
       double dailyrate = rate/365;

       while ( i <= yr){ // for annual computation
           annual += (annual*rate);  
           i++;
       }System.out.println("The amount total in annually is: " +annual);
       while(j <=12*yr){ // for monthly computation
           monthly += (monthly *monthlyrate); 
           j++;
       }System.out.println("The amount total in monthly is: " +monthly);
       while (k <=365*yr){ //for daily computation
           daily+= (daily*dailyrate); 
           k++;
       }System.out.println("The amount total in daily is: " +daily);
    }
}
