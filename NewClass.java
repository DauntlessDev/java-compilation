
package collections;

import java.util.*;
public class NewClass {
    public static void main(String args[]){
    Integer values[] = {1,2,3,4,5,6,7,8,9,10};
    List<Integer> listOfValues = new ArrayList();
    System.out.println(listOfValues);
        
        
    for(Integer value : values)
        listOfValues.add(value);
    for(Integer value : values)
            System.out.print(value);
    

    Iterator i = listOfValues.iterator();
    
    while(i.hasNext()){
        System.out.print(i.next());
        }
        System.out.print(listOfValues.add(5));
    for(Integer value : values)
            System.out.print(value);
    System.out.println(listOfValues.isEmpty());
    System.out.println(listOfValues.contains(1));
    System.out.println(listOfValues.size());
    System.out.println(listOfValues.remove(1));
    while(i.hasNext()){
        System.out.print(i.next());
        }
    System.out.println(listOfValues.remove(1));
    }
}

