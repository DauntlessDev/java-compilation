public class JavaOperatorsDemo {
    public static void main(String[] args){
        int value =1;
        
        //unary-operators
        System.out.println(value);
        System.out.println(-value);
        System.out.println(value++);
        System.out.println(++value);
        System.out.println(value--);
        System.out.println(--value);  
        
        //binary-operators
        System.out.println(10+2);
        System.out.println(10-2);
        System.out.println(10*2);
        System.out.println(10/2);
        System.out.println(10%2);
        
        //Relational Operators
        int grade = 69;
        System.out.println(grade>70);
        System.out.println(grade>=70);
        System.out.println(grade<70);
        System.out.println(grade<=70);
        System.out.println(grade==70);
        System.out.println(grade!=70);
        
        //Logical Operators
        grade = 200;
        System.out.println(grade>=0 && grade<=100);
        System.out.println(grade<0 && grade>100);
        System.out.println(!(grade<=0));
        
        //Shift Operators
        System.out.println(64>>4);
        System.out.println(32<<4);
        
        //bitwise-operators
        System.out.println(10|4);
        System.out.println(10&2);
        System.out.println(10^6);
        System.out.println(~10);
        
        //ternary operators
        grade=75;
        System.out.println(grade>=70?"Passed" : "Failed");
        
        //Assignment Operator
        System.out.println(grade=100);
        System.out.println(grade+=100);
    }   
}
