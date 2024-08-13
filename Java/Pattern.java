import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sss = new Scanner(System.in);
        int size = sss.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if (i <= j) {
                    System.err.print("* ");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
            
        }
    }
}
