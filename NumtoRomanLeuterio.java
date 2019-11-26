
import java.util.InputMismatchException;
import java.util.Scanner;


public class NumtoRomanLeuterio {
    public static void main(String []args) 
    { 
        int inputNum;
        String tryAgain = "Y";
        while(tryAgain.equalsIgnoreCase("Y")){
            
            Scanner input = new Scanner(System.in);
            try{
            
            System.out.print("\nPlease enter the numbers: ");
            inputNum = input.nextInt();

            if(inputNum==0)
                    throw new NonCountingException();

            System.out.println("Result:\n"+inputNum+" = "+intToRoman(inputNum));
            System.out.println(intToRoman(inputNum)+" = "+inputNum);
            }
            
            catch(NonCountingException e){
                e.getMessage();
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid Range! 1-3999 only");
            }
            catch(InputMismatchException e){
                System.out.println("Please input numbers only!");
            }
            finally{
                System.out.println("\nThank You! Enter Y to try again, else any other keys to quit");
                tryAgain = input.next();
               
            }
        }
    }
     
     static String intToRoman(int num)  
    {  
        // storing roman values of digits from 0-9  
        String m[] = {"", "M", "MM", "MMM"}; 
        String c[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}; 
        String x[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}; 
        String i[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}; 
              
        // Converting to roman 
        String thousNum = m[num/1000]; 
        String hundsNum = c[(num%1000)/100]; 
        String tensNum = x[(num%100)/10]; 
        String singleNum = i[num%10]; 
        String result = thousNum + hundsNum + tensNum + singleNum; 
              
        return result; 
    }
             
}


