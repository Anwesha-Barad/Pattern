import java.util.Scanner;

public class ReverseHalfCharacterPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            char ch = 'A';

            // increasing characters
            for(int j = 1; j <= i; j++) {

                System.out.print(ch);
                ch++;
            }

            ch -= 2;

            // decreasing characters
            for(int j = 1; j < i; j++) {

                System.out.print(ch);
                ch--;
            }

            System.out.println();
        }

        sc.close();
    }
}
/*
ABCDEDCBA
 ABCDCBA
  ABCBA
   ABA
    A
*/