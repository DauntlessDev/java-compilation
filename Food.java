package filehandling;

import java.io.Serializable;

public class Food implements Serializable{
    static int price = 100;
    transient int quantity = 200;
    String name = "Pandog";
}
