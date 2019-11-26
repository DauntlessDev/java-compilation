
import java.util.InputMismatchException;
import java.util.Scanner;


public class NumtoWordsLeuterio {
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
          
            System.out.println("Result:\n"+inputNum+" = "+convertToWord(inputNum));
            System.out.println(convertToWord(inputNum)+" = "+inputNum);
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
    static String convertToWord(int n)  
    {  
        // storing words of digits from 0-9  
        String q[] = {"", "One", "Two", "Three"}; 
        String w[] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"}; 
        String e[] = {"", "Ten", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "}; 
        String r[] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"}; 
              
        // Converting to WORD

        String tensNum = e[(n%100)/10]; 
        String onesNum = r[n%10]; 
        String thousNum = q[n/1000]; 
        String hundsNum = w[(n%1000)/100]; 
    
        if(tensNum.equals("ten")){
            if(onesNum.equals("one")){
                    tensNum = "eleven";
                    onesNum = "";
            }
            else{
                tensNum = "";
                switch(n%10){
                    case 0: onesNum = "ten"; break;
                    case 1: onesNum = "eleven"; break;
                    case 2: onesNum = "twelve"; break;
                    case 3: onesNum = "thirteen"; break;
                    case 4: onesNum = "fourteen"; break;
                    case 5: onesNum = "fifteen"; break;
                    case 6: onesNum = "sixteen"; break;
                    case 7: onesNum = "seventeen"; break;
                    case 8: onesNum = "eighteen"; break;
                    case 9: onesNum = "nineteen"; break;
                }
            }
        }
        if(!thousNum.equals(""))
            thousNum += " Thousand ";
        if(!hundsNum.equals(""))
            hundsNum += " Hundred ";
        
        String result = thousNum + hundsNum + tensNum + onesNum; 
              
        return result; 
    }
}

class NonCountingException extends Exception{
    @Override
    public String getMessage(){
        return "Invalid, Roman Numerals has no equivalent for Zero.";
    }
}


