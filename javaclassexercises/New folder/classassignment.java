//Yohannes Tigistu ETS 1703/14
//Yohanna Betsiha Ets 1701/14
import java.util.Scanner;
class Student{
  public int id;
  public String name;
  public double grade;
  public  Student(){
    this.id=1;
    this.name="john";
    this.grade=3.8;
  }
  public Student(int id,String name,double grade){
    this.id=id;
    this.name=name;
    this.grade=grade;
  }
  public void display(){
    System.out.println("Id\tName\tGrade");
    System.out.println(this.id+"\t"+this.name+"\t"+this.grade);
  }
  public  void modifi(double grade){

    this.grade=grade;
  }
 public static double average(Student[]s,int n){
     double sum=0.0;
   for(int i=0;i<n;i++){
    sum=sum+s[i].grade;
 }
   return(sum/n);
}
}
public class classassignment {
  public static void main(String[]args){
    Scanner keyboard= new Scanner (System.in);
    Student[] s =new Student[10];// since we can create multiple student objects using this array .
    char ans;                   // we havent done it manually.
      System.out.print("please enter number of students ");
    int n=keyboard.nextInt();
    for(int i=0;i<n;i++){
      s[i]=new Student();
      System.out.print("please enter Id ");
      s[i].id=keyboard.nextInt();
      System.out.print("please enter name ");
      s[i].name=keyboard.next();
      System.out.print("please enter grade ");
      s[i].grade=keyboard.nextDouble();
    }
    for(int i=0;i<n;i++){
      s[i].display();
    }
    System.out.print("which student you wanna change ");
    int num=keyboard.nextInt();
    System.out.print("please enter the value need to change");
    double newgrade=keyboard.nextDouble();
    s[num-1].modifi(newgrade);//since array index start form 0.hence the -1
    double average=Student.average(s,n);
    System.out.println("The average is: "+average);
    System.out.print(" enter Y/y to continue");
     ans=keyboard.next().charAt(0);
    } 
  }