import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sss = new Scanner(System.in);
        char letter = sss.next().charAt(0);
        
        int ascii = letter;
        System.out.println("The ASCII value of "+letter+" is "+ascii);

    }
}
