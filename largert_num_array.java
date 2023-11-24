public class largert_num_array {
  public static void main(String[]args){
    int[]arrnum={20,43,63,12,78,84,33,55};
    int largest=0;
     largest=arrnum[0];
    for(int i=0;i<arrnum.length;i
    ++){
      if(largest<arrnum[i]){
      largest=arrnum[i];
      }
    }
      System.out.println("The largest number in the array is "+largest);
  }

}
