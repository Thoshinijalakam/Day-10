class a{
    int c;
    String b;
    a(int c,String b){
        this.c=c;
        this.b=b;
    }
    void display(){
        System.out.println(b+" "+c);
        }
}
public class Paramaterizedcon{
    public static void main(String[]args){
        a s=new a(678,"Thoshini");
        s.display();
    }
}
/* Thoshini 678 */
