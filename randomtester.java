public class randomtester {
  public static int factorial(int num){
    if(num==1){
      return 1;
    }
    else{
      return num*factorial(num-1);
    }
  }
  public static void main(String[]args){
    int a=5;
    int result;
    result=factorial(a)/(factoraial(a-a));
    System.out.println(result);
  }
}
