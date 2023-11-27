 import java.util.Scanner;
 class area{
  private int width;
  private int length;
  public void setDim(int width, int length){
    this.width=width;
    this.length=length;
  }
  public int getArea(){
    return(length*width);
  }
}
public class classfirst{
  public static void main(String[]args){
   area rect= new area();
   int width;
   int length;
   Scanner keyboard= new Scanner(System.in);
   System.out.println("please enter width and length separated by space");
     width= keyboard.nextInt();
     length=keyboard.nextInt();
   rect.setDim(width,length);
   int area=rect.getArea();
   System.out.print("The area is: "+area);
  }
}