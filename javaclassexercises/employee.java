import java.util.Scanner;
class employe{
  public String name;
  public int yearOfJoining;
  public String address;
    void getdat(String name,int yearOfJoining,String address){
    this.name=name;
    this.yearOfJoining=yearOfJoining;
    this.address=address;
    }
}
public class employee {
  public static void main(String[]args){
    employe[] E =new employe[10];
    Scanner keyboard = new Scanner(System.in);
    System.out.print("How many employees would you add ");
    int n=keyboard.nextInt();
    
    for(int i=0;i<n;++i){
      E[i]=new employe();//note to self dont use nextline for right before an input statement.
      System.out.print("Enter name: ");
      E[i].name=keyboard.next();
      System.out.print("Enter year of joining: ");
      E[i].yearOfJoining=keyboard.nextInt();
      System.out.print("Enter Address: ");
      E[i].address=keyboard.next();
    }
    System.out.println("Name\tYear of joining\t Address");
    for(int i=0; i<n;i++){
       System.out.println(E[i].name+"\t\t"+ E[i].yearOfJoining+"\t\t"+E[i].address);
    }
  }
}
