import java.util.Scanner;
public class MagicSquare {
  public static void main(String[] args) { 
    int rowSum, colSum, diagSum = 0, sum = 0,inputNum, i, j ,counter=1;
    boolean ifMagicSquare = true, ifDuplicate;
    int[][] squareArray = new int[3][3];
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter from 1st row's left to 1st row's right then next the row.");
    //Input numbers for cell
    for (i=0; i<3; i++){
      for (j=0; j<3; j++){
      do{
      ifDuplicate = false;
      System.out.print("Input Values #"+(counter)+": ");
      inputNum = input.nextInt();
        for(int k = 0; k<i; k++){
            for(int l = 0; l <j; l++){
                if(inputNum == squareArray[k][l] ){
                    ifDuplicate = true;
                    break;
                }
            }
        }
        if(inputNum <= 0 || inputNum > 9){
            System.out.println("You have entered invalid number, please try again.");
            System.out.println("Enter numbers only from 1 to 9.");
            ifDuplicate = true;
        }else if(ifDuplicate){
            System.out.println("You have already inputted that number, please try again.");
            System.out.println("Enter numbers only from 1 to 9.");
        }else
            squareArray[i][j] = inputNum;
            
      }while(ifDuplicate);
      counter++;
    }
    }
    //Display square
    System.out.println("Square");
    for (i=0; i<3; i++) {
      for (j=0; j<3; j++) 
        System.out.print(squareArray[i][j] + " ");
      System.out.println();
    }
    
    //Calculate sum of the first row
    for (j=0; j<3; j++)
      sum += squareArray[0][j];
    
    //Calculate sum of 2nd and 3rd row
    for (i=1; i<3; i++) {
      rowSum = 0;
      for (j=0; j<3; j++)
        rowSum += squareArray[i][j];
      if (rowSum != sum) {
        ifMagicSquare = false;
        break;
      }
    }
    
    //Calculate sum of each column
    if (ifMagicSquare) {
      for (j=0; j<3; j++) {
        colSum = 0;
        for (i=0; i<3; i++)
          colSum += squareArray[i][j];
        if (colSum != sum) {
          ifMagicSquare = false;
          break;
        }
      }
    }
    
    //Calculate sum of first diagonal
    if (ifMagicSquare) {
      for (i=0; i<3; i++)
        for (j=0; j<3; j++)
        if (i==j)
        diagSum += squareArray[i][j];
      if (diagSum != sum) {
        ifMagicSquare = false;
      }
    }
    
    //Calculate sum of 2nd diagonal
    if (ifMagicSquare) {
      diagSum = 0;
      for (i=0; i<3; i++)
        for (j=0; j<3; j++)
        if ((i+j) == 2)
        diagSum += squareArray[i][j];
      if (diagSum != sum) {
        ifMagicSquare = false;
      }
    }
    
    //Print the final result
    if (ifMagicSquare)
      System.out.println("Congrats! It is a Magic Square!");
    else
      System.out.println("Sorry! It is not a Magic Square.");
   
 }
}