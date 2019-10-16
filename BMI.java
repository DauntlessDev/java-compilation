import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("BODY MASS INDEX"); // display the bmi title
        Scanner s = new Scanner(System.in); // for input
        System.out.print("Weight(in Kg):"); // display for entering weight
        double weight = s.nextDouble(); // for the input of weight
        System.out.printf("Height (in cm):"); // display for entering height
        double height = s.nextDouble(); // for the input of height
        height = height/100; // formula to convert cm to meter
        double BMI = weight / (height * height); // formula of BMI

        String weightStatus = (BMI < 18.5) ? "Underweight": // if BMI is less than 18.5 then 
                // if BMI is greater than or equal to 18.5  and less than or equal to 24.9 then normal
                (BMI >= 18.5 && BMI <= 24.9)? "Healthy" : 
                // if BMI is greater than or equal to 25 && less than or equal to 29.9
                // then normal else if not, obese
                (BMI >= 25 && BMI <= 29.9)? "Overweight" : "Obese";
        //display the result of the BMI and the weight status
        System.out.println("BMI Value: " + BMI );
        System.out.println("Weight Status: " +weightStatus);
    }
}
