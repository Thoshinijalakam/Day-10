import java.util.*;
public class Thhiskeywordpassing {
    String name;
    Thhiskeywordpassing(String name){
        this.name=name;
    }
    void dis1(){
        System.out.println(name);
    }
    void agt()
    {
        teacher s=new teacher();
        s.teach(this);
    }
    public static void main(String args[]){
        Thhiskeywordpassing o=new Thhiskeywordpassing("thoshini");
        o.agt();
    }
    
}
class teacher{
    public void teach(Thhiskeywordpassing s){
        s.dis1();
    }
}
/* thoshini */
