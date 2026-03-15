import java.util.Scanner;

class Pattern4 {
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stars: ");
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }
}