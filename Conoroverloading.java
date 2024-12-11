import java.util.*;
public class Conoroverloading {
    String name;
    Conoroverloading()
    {
        name="Thoshini";
    }
    Conoroverloading(String name){
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
    public static void main(String[]args){
        Conoroverloading o =new Conoroverloading();
        o.display();
        Conoroverloading o1=new Conoroverloading("Hemanya");
        o1.display();
    }

    
}
/* Thoshini
Hemanya */
