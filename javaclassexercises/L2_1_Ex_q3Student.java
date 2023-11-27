import java.util.Scanner;
 class Stud{
  public class person{
  public String name;
  public int age;
   person(){
   name="";
    age=0;
  }
  person(String name, int age){
    this.name=name;
    this.age=age;
  }
  
 }
 public String id;
 Stud(){
  id="";
 }
 Stud(String id){
  this.id=id;
 }
 public void display(Stud s,person p){
 System.out.println("Name\tAge\tId");
 System.out.println(p.name+"\t"+p.age+"\t"+s.id);
 }
}
public class L2_1_Ex_q3Student{
  public static void main(String[]args){
   Stud s = new Stud();
   Stud.person p1 =s.new person();
   p1.name="john";p1.age=19;s.id="ETS 1703";
   s.display(s,p1);
  }
}
