package sample;

import java.util.HashMap;
import java.util.Map;
public class MapDemo {
    public static void main(String args[]){
        Map contacts = new HashMap();                
        contacts.put("1","A");
        contacts.put(2,"B");
        contacts.put(3,"C");
        contacts.put("1","D");
        System.out.println(contacts);
        
        System.out.println(contacts.get(3));
        System.out.println(contacts.containsKey("1"));
        System.out.println(contacts.containsValue("A"));
    }
    
}
