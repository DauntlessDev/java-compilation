

package sample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDEmo {
    public static void main (String args[]){
        Set days = new HashSet();
        Set anotherDays = new LinkedHashSet();
        Set nextDays = new TreeSet();
        String strDays[] = {"M","T","W","H","F","S","S"};
        
        for(String day : strDays){
            System.out.println(days.add(day));
            System.out.println(anotherDays.add(day));
            System.out.println(nextDays.add(day));
        }
        System.out.println(days);
    }
}
