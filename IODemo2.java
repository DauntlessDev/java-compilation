
package filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo2 {
    public static void main(String args[]) throws IOException{
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        try{
            fos = new FileOutputStream("java.txt");
            dos = new DataOutputStream(fos);
            dos.writeInt(100);
            dos.write(65);
            dos.writeDouble(4.0);
        }catch(FileNotFoundException e){
            
        }finally{
            dos.close();
            fos.close();
            
        }
        
        FileInputStream fis = new FileInputStream("java.txt");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.read());
        
        
    }
}
