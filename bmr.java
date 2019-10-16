import java.util.Scanner;

public class bmr {
   static final double VL = 1.30, L = 1.55, M = 1.65, H = 1.80, VH = 2.0; // constant activity level values
   static public void main(String args[]){
        Scanner input = new Scanner(System.in);
        boolean looping = true;   // for the loop of the whole program, false to make it exit
        double lfm = 0, actMultiplier = 0, genderMulti = 0, bmr, weight; // variables for calculation
        String gender, choice; // gender for inputs, choice for Y or N of the loop
        int age, option;

        do{
            System.out.println("****BASAL METABOLIC RATE****");
            System.out.println(" ");
            do{
                System.out.print("Enter Weight (in Kg): "); // display and input of weight + error message
                weight = input.nextDouble();
                if(weight<=0){
                    System.out.println("Invalid weight, please input a valid one. ");
                }
            }while(weight<=0); // if weight is zero or lesser, it is zero
            do{
                System.out.print("Enter Age: ");  // display and input of age + error message
                age = input.nextInt();
                if(age<10){
                    System.out.println("Invalid: Sorry, must be at least 10 yrs old. ");
                }
            }while(age<10); // must be atleast 10 yrs old to exit the loop

            do{
                System.out.print("Gender('male'/'female') :");  // display and input of gender + error message
                gender = input.next();
                if(!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female")){
                    System.out.println("Invalid gender! Please input a valid one");
                }
            }while(!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female"));

            if(gender.equalsIgnoreCase("male")){
                genderMulti = 1;
                if(age>= 10 && age<=14){
                    lfm = 1.0;
                }
                if(age>= 15 && age<=20){
                    lfm = 0.95;
                }
                if(age>= 21 && age<=28){
                    lfm = 0.90;
                }
                if(age>28){
                    lfm = 0.85;
                }
            }

            if(gender.equalsIgnoreCase("female")){
                genderMulti=0.9;
                if(age>= 10 && age<=18){
                    lfm = 1.0;
                }if(age>= 19 && age<=28){
                    lfm = 0.95;
                }if(age>= 29 && age<=38){
                    lfm = 0.90;
                }if(age>39){
                    lfm = 0.85;
                }
            }
            // display of activity levels
            System.out.println(" ");
            System.out.println("Activity Level");
            System.out.println("[1]Very Light");
            System.out.println("[2]Light");
            System.out.println("[3]Moderate");
            System.out.println("[4]Heavy");
            System.out.println("[5]Very heavy");
            
            do{
                System.out.print("Option: ");
                option = input.nextInt();
                switch(option){ // values of activity multiplier depending on the activity level
                    case 1: 
                        actMultiplier = VL;
                        break;
                    case 2: actMultiplier = L;
                        break;
                    case 3: actMultiplier = M;
                        break;
                    case 4: actMultiplier = H;
                        break;
                    case 5: actMultiplier = VH;
                        break;
                    default:
                        System.out.println("Invalid Input, Please Try Again. ");
                }
            }while((option <= 0) || (option > 5) ); // while 0, less than zero, or greater than 5
            
            System.out.println(" ");
            bmr=(weight)*(genderMulti)*24*(lfm)*(actMultiplier); // calculation for bmr
            System.out.printf("BMR Value: %.2f", bmr); // display bmr with 2 decimals
            
            do{
                System.out.print("\nWould you like to try again? (Y/N): "); // for the loop, if user will exit or not
                choice = input.next(); // display and input of choice if yes or no to try again + error message

                if(choice.equalsIgnoreCase("Y")) {
                    // do nothing and continue
                }else if(choice.equalsIgnoreCase("N")) {
                    System.out.println("Thank you!");
                    looping = false;
                }else {
                    System.out.println("Invalid request. Please try again.");
                }
            }while(!choice.equalsIgnoreCase("Y") && !choice.equalsIgnoreCase("N") );           
        }while(looping);
    }//last bracket
}