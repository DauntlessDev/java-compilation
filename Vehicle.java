package brave;
public class Vehicle {
    final static String MODEL = "2019";
    String brand;
    int speed;
    private int price;
    
    // constructor
    public Vehicle(){
        brand = "Toyota";
        speed = 10;
        price = 50;
    }
    public Vehicle(String brand){
        this.brand = brand;
        speed = 10;
        price = 50;
    }
    public Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
    public Vehicle(String brand, int speed, int price){
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }
    public static void main(String args[]){
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("Nissan");
        Vehicle v3 = new Vehicle("Masda", 100);
        Vehicle v4 = new Vehicle("Mitsubishi", 80, 1000);
        System.out.println(v1.MODEL);
        System.out.println(v1.brand);
        System.out.println(v1.speed);
        System.out.println(v1.price);
        System.out.println(v2.MODEL);
        System.out.println(v2.brand);
        System.out.println(v2.speed);
        System.out.println(v2.price);
        System.out.println(v3.MODEL);
        System.out.println(v3.brand);
        System.out.println(v3.speed);
        System.out.println(v3.price);
        System.out.println(v4.MODEL);
        System.out.println(v4.brand);
        System.out.println(v4.speed);
        System.out.println(v4.price);
        
        
    }
    
}
