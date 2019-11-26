
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LabEx10Leuterio {

    public static void main(String args[]){
        
        try {

            int count;
            String srcFile = new String();
            String dstFile = new String();
            Scanner input = new Scanner(System.in);

            System.out.print("Enter destination filename: ");
            dstFile = input.nextLine();
            dstFile = dstFile.trim().concat(".txt");
            
            System.out.print("Enter source filename: ");
            srcFile = input.nextLine();
            srcFile = srcFile.trim().concat(".txt");
            

            File destFile = new File(dstFile);
            File sourceFile = new File(srcFile);
            String text;
            System.out.println("\nInput in the sourcefile: ");
            text = input.nextLine();
            
            sourceFile.createNewFile();
            FileWriter filewriter = new FileWriter(sourceFile);
            filewriter.write(text);
            filewriter.flush();
            
            
            FileReader fr = new FileReader(srcFile);
            String newStr = new String();
            
            while((count=fr.read())!=-1){
                if(String.valueOf((char)count).equals(" ")){
                    newStr+="_";
                    System.out.print("_");
                    continue;
                }
                else{
                    //newStr.concat(String.valueOf((char)i));
                    newStr+=String.valueOf((char)count);
                     System.out.print((char)count);        
                }

            }
            
                
            destFile.createNewFile();
            FileWriter filewriter2 = new FileWriter(destFile);
            filewriter2.write(newStr);
            filewriter2.flush();
            System.out.println("\n\"" + newStr +"\" is successfully saved to the destination file.");
            
        filewriter.close();
        } catch (IOException ex) {
            System.out.println("There is an error in the input/output process!");
        }
	       
	    }
	

}
