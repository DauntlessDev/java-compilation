public class JavaArrayDemo {
    public static void main (String args[]){
        String days[] = {"Monday","Tuesday",
                        "Wednesday", "Thursday",
                        "Friday", "Saturday",
                        "Sunday"};
        days[0]="Holiday";
        days[1] = days[6];
        
        if(days[2]=="Wednesday")
            System.out.println("Yes");
        if (days[2].equalsIgnoreCase("wEdNeSdAy"))
            System.out.println("Yes");
        String anotherDays[];
        anotherDays = new String[7];
        
        int quizGrade[] = new int[1];
        
        for(String day: days){
            System.out.print(day+"\t");
        }
        
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        
        if (str1==str2)
            System.out.println("Yes");
        if (str1 == str3)
            System.out.println("Yes");
    }
    
}
