/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 201812522
 */
public class IODemo1 {
    public static void main(String args[]){
        try{
            File filename = new File("C:\\Users\\201812522\\Desktop\\sample.txt");
            if(filename.exists()){
                FileInputStream fis = new FileInputStream(filename);
                BufferedReader br = new BufferedReader(new InputStreamReader(fis));
                String line;
                while((line=br.readLine())!= null){
                    System.out.println(line);
                }
            }else{
                filename.createNewFile();
            }
        }catch(IOException e){
            
        }finally{
            //
        }
        
        
    }
}
