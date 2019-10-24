package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class IODemo3 {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        List<Integer> values = new ArrayList();
        List<Integer> anotherValues = new ArrayList();
        values.add(1);
        values.add(1);
        values.add(1);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream("C:\\Users\\201812522\\Documents\\NetBeansProjects\\CCS0069L-N21\\src\\filehandling\\values.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(values);
        }catch(FileNotFoundException e){
            
        }catch(IOException e){
            
        }finally{
            oos.close();
            fos.close();
        }
        FileInputStream fis = new FileInputStream("C:\\Users\\201812522\\Documents\\NetBeansProjects\\CCS0069L-N21\\src\\filehandling\\values.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        try{
            anotherValues = (ArrayList) ois.readObject();
            for(Integer i : anotherValues)
                System.out.println(i);
        }catch(ClassNotFoundException e){}
    }
    
}
