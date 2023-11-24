import java.util.Scanner;
public class PrintDayInWorld{
  
  public static void main(String[]args){
 
    Scanner myobj = new Scanner(System.in);
    System.out.println("Enter day num");
    int daynumber=myobj.nextInt();
    if(daynumber<4){
      if(daynumber<2)   {

        if(daynumber==0){
         System.out.println("Sunday");
        }
         else{
        System.out.println("Monday");
        }
      }
     else{ 
        if(daynumber==2){ 
          System.out.println("Tuesday");
        }
        else{
          System.out.println("Wednesday");
        }
      }
    }
    else{
      if(daynumber<6){
        if(daynumber==4){
           System.out.println("Thursday");
        }
        else{
          System.out.println("Friday");
        }
      
      }
      else{
        if(daynumber==6){
           System.out.println("Saturday");
        }
        else{
           System.out.println("Sunday");
        }
      }
    }
  }
}
}