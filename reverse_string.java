public class reverse_string {
  public static void main(String[]args){
    String normal="yohannes";
    String reversed=""; //initialization

    for (int i=0;i<normal.length();i++){
         reversed=normal.charAt(i)+reversed;//concatinates infront of the reversed string.
    }
    System.out.println("The reversed string is "+ reversed);
  }
  
}
