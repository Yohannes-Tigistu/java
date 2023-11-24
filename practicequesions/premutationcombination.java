import java.util.Scanner;
public class premutationcombination{
  public static  int factorial (int num){
    if(num==1){
      return 1;
    }
    else{
      return num*factorial(num-1);
    }
  }
  public static int permuation(int n , int r){
    int p=0;
    p= factorial(n)/(factorial(n-r));
      return p;
  }
  public static int combination(int n, int r){
    int C=0;
    C=factorial(n)/(factorial(n-r)*factorial(r));
    return C;
  }
  public static void main(String[]args){
    Scanner keyboard=new Scanner(System.in);// using one scanner object only.
    char ans=' ';
    do{
       System.out.print("\nplease enter n: ");
       int n=keyboard.nextInt(); //Assigning next input to the variable n.
       System.out.print("\nplease enter r: ");
       int r=keyboard.nextInt(); //same thing.
       System.out.println("\nwhat do you want to calculate\n  1.permutaion\n  2.combination"); //using one output statment
       int count= keyboard.nextInt();
       if(count==1){
       int NPR= permuation(n,r);
       System.out.print("permutation of the numbers is: "+NPR);
       }
       else if (count==2){
        int NCR=combination(n,r);
        System.out.println("combination of the numbers is: "+NCR);
       }
       else{
        System.out.print("please enter number 1 or 2: ");
       }
        System.out.print("\ndo you want to continue press y/Y.");
       ans =keyboard.next().charAt(0);

    }while(ans=='Y'||ans=='y');
  }
}
