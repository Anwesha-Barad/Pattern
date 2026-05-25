import java.util.Scanner;
 class DiamondPattern
 {
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of star:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
             System.out.println();
        }
           for(int i=n-1;i>=1;i--){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
             System.out.println();
        }
        sc.close();
 
    }
}

/*
--------------
    *
   ***
  *****
 *******
*********

--------------
*/