import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class LabEx9Leuterio {
    private static Scanner input;

	public static void main(String args[]){

        input = new Scanner(System.in);
        String inputs,namesP,typeP,colorP,ageP,sizeP;
        
        SortedSet<String> sortedsetP = new TreeSet<String>();
        Vector<String> vectorPets = new Vector<String>();
        Hashtable<Integer,String> tablePets = new Hashtable<Integer, String>();
        
        
       do{
        System.out.println("---Collection's Menu---\n\n");
        System.out.println("A. Vector\n");
        System.out.println("B. TreeSet\n");
        System.out.println("C. Hashtable\n");
        System.out.println("D. Exit");
        
        
        
        System.out.print("\nEnter your choice: ");
        inputs = input.nextLine();
        
        if(inputs.equalsIgnoreCase("A")){
            System.out.println("\nEnter 5 names of pet: ");
            for(int i = 0; i<5; i++){
                System.out.print("Pet Name " + (i+1) + ": ");
                namesP = input.nextLine();
                
                vectorPets.add(namesP);
            }
            
            
            
            Collections.sort(vectorPets);
            Iterator<String> it = vectorPets.iterator();
            System.out.println("\nThe sorted name of pets are: ");
            while(it.hasNext()){
                System.out.println(it.next());
            }
            System.out.println("");
            vectorPets.clear();
            
        }
        
        else if(inputs.equalsIgnoreCase("B")){
        	
            System.out.println("\nInput 5 names of pet: ");
            for(int i = 0; i<5; i++){
                System.out.print("Pet Name " + (i+1) + ": ");
                namesP = input.nextLine();
                sortedsetP.add(namesP);
            }
                
            Iterator iteratorP = sortedsetP.iterator();
            
            System.out.print("\nYour sorted pet names are: \n");
            while(iteratorP.hasNext()){
            	
            	
                System.out.println(iteratorP.next());
            }
            System.out.println("");
            sortedsetP.clear();
        }
        
        else if(inputs.equalsIgnoreCase("C")){
                 
            for(int i = 5; i> 0; i--){
                switch (i) {
                    case 5:{
                        System.out.print("Pet Type: ");
                        typeP = input.nextLine();
                        tablePets.put(i,typeP);
                        break;
                    }
                    case 4:{
                        System.out.print("Pet Name: ");
                        namesP = input.nextLine();
                        tablePets.put(i,namesP);
                    }
                        break;
                    case 3:{
                        System.out.print("Pet Color: ");
                        colorP = input.nextLine();
                        tablePets.put(i,colorP);
                    }
                        break;
                    case 2:{
                        System.out.print("Pet Age: ");
                        ageP = input.nextLine();
                        tablePets.put(i,ageP);
                    }
                        break;
                    case 1:{
                        System.out.print("Pet Size: ");
                        sizeP = input.nextLine();
                        tablePets.put(i,sizeP);
                    }
                        break;
                    default:
                        break;
                }
            }
            
            System.out.println("\n---Information of the pet---");
            System.out.println("Pet Type: "+ tablePets.get(5));
            System.out.println("Pet Name: "+ tablePets.get(4));
            System.out.println("Pet Color: "+ tablePets.get(3));
            System.out.println("Pet Age: "+ tablePets.get(2));
            System.out.println("Pet Size: "+ tablePets.get(1));
            System.out.println("");
            
            
            tablePets.clear();
            
        }
        
        else if(inputs.equalsIgnoreCase("D")){
            System.out.println("You have exited, Thankyou!");
        }
        else{System.out.println("\nInvalid Input!\nPlease enter a valid input.\n");}
       }while(!inputs.equalsIgnoreCase("D"));
        
    }
}
