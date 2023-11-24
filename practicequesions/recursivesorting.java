import java.util.Scanner;
public class recursivesorting {
  public static void check(int[]a,int size){
    int count=1;
    for(int i=0;i<size;i++){
      if(i+1!=size){
        if(a[i]>a[i+1]){
         System.out.println("The array  is not in order");
         count=0;
         break;
        }
      } 
    }
     if(count==1){
       System.out.println("The array is in order");
     }
  }
  public static void arrange(int[]a,int size){
   for (int i=0;i<size;++i){  //an additional loop is requried to if you are trying to fix a more than one number gap;
     for(int j=0;j<size;++j){
        if(j+1!=size ){
          if(a[j]>a[j+1]){
            int temp;
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
          }
        }
      }
    }
  }

  public static void main(String[]args){
   int[]arr={1,5,6,7,3,8,2,4};
     int size=arr.length;
     check(arr,size);
     arrange(arr,size);
     check(arr, size);
     for(int i=0;i<size;i++){
       System.out.println(arr[i]+" ");
     }
  }
}
