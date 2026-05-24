
import java.util.*;
 class HalfPyrami{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of star:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
             System.out.print(" * ");
           }
            System.out.println();
        }
    }
 }



 /*
 ...................
 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *
 ''''''''''''''''''
  */