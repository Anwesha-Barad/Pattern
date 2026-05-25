import java.util.Scanner;

public class CharacterPyramid{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();
         for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                 System.out.print(" ");
            }
           char ch='A';
            //increasing number
             for(int j=1;j<=i;j++){
                 System.out.print(ch);
                 ch++;
            }
            ch-=2;
            //decreasing number
             for(int j=i-1;j>=1;j--){
                 System.out.print(ch);
                 ch--;
            }

            System.out.println();
        }
    }
}
/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
*/