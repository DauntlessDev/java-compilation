import java.util.Scanner;
public class StudentRecord {
    int id;
    String name;
    String course;
    public StudentRecord(int id, String name, String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }
    public StudentRecord(){
        
    }
    public static void main(String args[]){
        StudentRecord cs0069_n21[];
        StudentRecord sample = new StudentRecord();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Number of Students: ");
        int classSize = input.nextInt();
        
        cs0069_n21 = new StudentRecord[classSize];
        
        for (int i = 0; i < cs0069_n21.length; i++){
            System.out.print("Student Id:");
            sample.id = input.nextInt();
            System.out.print("Name:");
            sample.name = input.next();
            System.out.print("Course:");
            sample.course = input.next();
            
            cs0069_n21[i] = new StudentRecord(sample.id, sample.name, sample.course);
            
        }for(int i = 0; i<cs0069_n21.length; i++){
            System.out.println(cs0069_n21[i].id);
            System.out.println(cs0069_n21[i].name);
            System.out.println(cs0069_n21[i].course);
        }
    }
}
