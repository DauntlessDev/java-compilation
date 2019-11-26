
import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LabEx10LeuterioB implements Serializable{
    
    public static void main(String args[]){
        
        FileOutputStream fileOutStream = null;
        ObjectOutputStream objOutStream = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try {
            
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            
            int integerX = input.nextInt();
            Integer intObj = new Integer(integerX);
            File newFile = new File("intObj.txt");
            newFile.createNewFile();
            
            
            
            fileOutStream = new FileOutputStream(newFile);
            objOutStream = new ObjectOutputStream(fileOutStream);
            objOutStream.writeObject(intObj);
            objOutStream.close();
            System.out.println("");
            System.out.println("\""+ integerX +"\" is saved into the stream!");
            
            fis = new FileInputStream(newFile);
            ois = new ObjectInputStream(fis);
            
            Integer readInterObject = (Integer) ois.readObject();
            ois.close();
            
            System.out.println("\nSuccessfully read the integer!!!");
            System.out.println("The object's value is: " + readInterObject);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LabEx10LeuterioB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LabEx10LeuterioB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LabEx10LeuterioB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        	
        	
            try {
                fileOutStream.close();
            } catch (IOException ex) {
                Logger.getLogger(LabEx10LeuterioB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }
}
