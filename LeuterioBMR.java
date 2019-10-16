import java.util.Scanner;
public class LeuterioBMR {
     public static void main(String[] args) {
        int age;
        double weight, height, BMRw, BMRm;
        System.out.println("Enter weight in lbs:");
        Scanner kb = new Scanner(System.in);
        weight = kb.nextDouble();

        System.out.println("Enter height in inches:");

        height = kb.nextDouble();

        System.out.println("Enter age in years:");

        age = kb.nextInt();

        BMRw = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);

        BMRm = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);

        System.out.println("BMR for woman is: " + BMRw);

        System.out.println("BMR for man is: " + BMRm);

        System.out.println("A typical Chocolate Bar contains about 230 calories");

        System.out.println("No. of Chocolate Bars consumed to maintain your weight: ");

        int choco = 230;

        System.out.println(Math.round(BMRw / choco));
        System.out.println(Math.round(BMRm / choco));
    }
}
