import java.util.*;
interface mobileapp{
    public void menu();
    public void rating();
    public void contact();
}
class b implements mobileapp{
    public void menu(){
        System.out.println("hello");
    }
    public void rating(){
        System.out.println("hello raju");
    }
    public void contact(){
        System.out.println("9087654321");
    }
}
public class Implements{
    public static void main(String args[]){
        b a=new b();
        a.contact();
    }
}
/* 9087654321 */
