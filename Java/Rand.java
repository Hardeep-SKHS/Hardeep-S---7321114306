import java.util.*;

public class Rand {
    public static void main(String[] args) {
        Scanner sss = new Scanner(System.in);
        System.out.println("Enter maximum number : ");
        int Max = sss.nextInt();

        Random number = new Random();

        int randam = number.nextInt(Max); 
        System.out.println(randam);
        
    }
}
