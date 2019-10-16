import java.util.Scanner;
public class MoneyConverter {
    public static void main(String[] args) {
        double peso;
        System.out.println("Enter amount in PESO:");
        Scanner reader = new Scanner(System.in);
        peso = reader.nextDouble();
        double amountinus = peso/43.33089*1.00000;
        double amountineuro = peso/43.33089*0.734719;
        double amountinyuan = peso/43.33089*6.346934;
        double amountinkoruna = peso/43.33089*18.77263;
        double amountinkrone = peso/43.33089*5.449007;
        double amountinsheqel = peso/43.33089*3.726334;
        double amountindinar = peso/43.33089*0.274588;
     
        System.out.println("The value in Philippine Peso is: " +peso);
        System.out.println("The value in Philippine USD is: " +amountinus);
        System.out.println("The value in Philippine EURO is: " +amountineuro);        
        System.out.println("The value in Philippine YUAN is: " +amountinyuan);
        System.out.println("The value in Philippine KORUNA is: " +amountinkoruna);
        System.out.println("The value in Philippine KRONE is: " +amountinkrone);
        System.out.println("The value in Philippine SHEGEL is: " +amountinsheqel);
        System.out.println("The value in Philippine DINAR is: " +amountindinar);
    }
}
