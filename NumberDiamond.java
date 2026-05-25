import java.util.Scanner;

public class NumberDiamond{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();
         for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                 System.out.print(" ");
            }
            //increasing number
             for(int j=1;j<=i;j++){
                 System.out.print(j);
            }
            //decreasing number
             for(int j=i-1;j>=1;j--){
                 System.out.print(j);
            }

            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            //space
            for(int j=1;j<=n-i;j++){
                 System.out.print(" ");
            }
            //increasing number
             for(int j=1;j<=i;j++){
                 System.out.print(j);
            }
            //decreasing number
             for(int j=i-1;j>=1;j--){
                 System.out.print(j);
            }

            System.out.println();
        }
    }
}
/*
    1
   121
  12321
 1234321
123454321
 1234321
  12321
   121
    1
*/