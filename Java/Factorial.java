import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sss = new Scanner(System.in);
        int number = sss.nextInt();
        int Factorial = 1;
        for(int i=number;i>0;i--){
           Factorial *= i;
           if (i > 1) {
            System.out.print(i+" X ");
           }
           else
           System.out.print(i+" = "+Factorial);

        }
    }
}
