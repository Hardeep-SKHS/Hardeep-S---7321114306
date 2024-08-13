import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner sss = new Scanner(System.in)) {
            int count = sss.nextInt();
            int First = 0;
            int Second = 1;
            System.out.print(First+" "+Second);

            for(int i=2;i<count;i++){
                int Third = First+Second;
                System.out.print(" "+Third);
                First = Second;
                Second = Third;
            }
            //System.out.print();
        }


    }
    
}
