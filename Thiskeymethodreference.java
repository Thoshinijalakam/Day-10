public class Thiskeymethodreference {
    void display(){
        System.out.println("Hello students");
    }
    void dis1(){
        this.display();
    }
    public static void main(String args[]){
        Thiskeymethodreference o=new Thiskeymethodreference();
        o.dis1();
    }
    
}
/* Hello students */