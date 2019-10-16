import java.util.Scanner;
public class FlowControls {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
 
        int grade;
        do{
            System.out.println("Grade:");
        grade = input.nextInt();
         
        }while (grade <=0 || grade > 100);
                /*
        if (grade <0=70 || grade <=100)
            System.out.println("Passed");
        else
            System.out.println("Failed");
        int option;
        int firstValue = 10;
        int secondValue = 2;
        int result = 0;
        
        for (int i=0; i<10; i++)
            System.out.println("i" +i);
        
        int x=1;
        while (x<100){
            System.out.println("x"+x );
            x+=5;
        }
        System.out.println("Arithmetic Operation");
        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.print("Option: ");
        option = input.nextInt();
        System.out.println("Grade: ");
        int grade = input.nextInt();
        if (grade>= 70){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        switch(option){
            case 1: result = firstValue + secondValue;
                    break;
            case 2: result = firstValue - secondValue;
                    break;
            default: System.out.println("Operation Unsupported");
        }
        System.out.println("Result: " +result);
    }
*/
    }
}
                
