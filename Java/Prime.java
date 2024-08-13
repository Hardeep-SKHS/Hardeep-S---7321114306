import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sss = new Scanner(System.in);
        int Prime = sss.nextInt();
        int count = 0;
        if (Prime == 1) {
         System.out.print(Prime+" is a neither prime nor composite");   
        }
        else{
        for(int i=1;i<=Prime;i++){
            if (Prime%i == 0)
            count++;   
        }
            if (count == 2) 
                System.out.print(Prime+" is a Prime Number");  
            
            else
                System.out.print(Prime+" is not a prime number");        
    }
} 
}
