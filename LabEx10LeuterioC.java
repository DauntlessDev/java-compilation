import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class LabEx10LeuterioC {
    
    public static void main(String args[]){
        
        try {
            Scanner input = new Scanner(System.in);
            

            System.out.print("Input the destination filename: ");
            String dstFile = input.nextLine();
            dstFile = dstFile.trim().concat(".txt");
            
            
            System.out.print("Input the source filename: ");
            String srcFile = input.nextLine();
            srcFile = srcFile.trim().concat(".txt");
            
            File newFile = new File(srcFile);
            newFile.createNewFile();
            
            System.out.println("");
            System.out.println("An EmptyFile.");
            System.out.print("Input into the file: ");
            String inputString = input.nextLine();

            
            FileWriter filewriter = new FileWriter(newFile);
            filewriter.write(inputString);
            filewriter.flush();
            System.out.println("\nThe input is saved in the srcFile");
            
            FileReader fileReader = new FileReader(srcFile);
            
            int i;
            String newStr = new String();
            while((i=fileReader.read())!=-1){
                 newStr+=String.valueOf((char)i);
            }
            
            char charXArr[] = newStr.toCharArray();
            
            System.out.println("\nEncrypting the Inputted String--");
            System.out.print("Enter the value of the shift size: ");
            int shiftSize = input.nextInt();
            

            int diffinputX;
            for(int z=0; z<charXArr.length; z++){
                diffinputX = charXArr[z]<<shiftSize;
                diffinputX-=shiftSize*100;
                charXArr[z] = (char) diffinputX;
            }
            System.out.print("Encrypt value result: ");
            System.out.println(charXArr);
            String encrypted = String.valueOf(charXArr);
            
            FileWriter filewriter2 = new FileWriter(dstFile);
            filewriter2.write(encrypted);
            filewriter2.close();
            System.out.println("The input has been encrypted and is successfully written into the destination file!");
        } catch (IOException ex) {
            Logger.getLogger(LabEx10LeuterioC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
