
package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class FoodTest {
        public static void main(String args[]) throws FileNotFoundException, IOException{
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        Food pandog = new Food();
        Food kwekkwek = new Food();
        try{
            fos = new FileOutputStream("C:\\Users\\201812522\\Documents\\NetBeansProjects\\CCS0069L-N21\\src\\filehandling\\food.wow");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(pandog);
        }catch(FileNotFoundException e){
            
        }catch(IOException e){
            
        }finally{
            oos.close();
            fos.close();
        }
        FileInputStream fis = new FileInputStream("C:\\Users\\201812522\\Documents\\NetBeansProjects\\CCS0069L-N21\\src\\filehandling\\food.wow");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        try{
            kwekkwek = (Food) ois.readObject();
            System.out.println(kwekkwek.name);
            System.out.println(kwekkwek.price);
            System.out.println(kwekkwek.quantity);
        }catch(ClassNotFoundException e){}
    }
    
}
