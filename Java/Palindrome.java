import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sss = new Scanner(System.in);
        String check = sss.nextLine();
        String reverse = "";
        for(int i=check.length()-1;i>=0;i--){
            reverse += check.charAt(i);
        }
        if (check.equals(reverse)) {
            System.out.print(check+" is a  Palindrome");
        }
        else
            System.out.print(check +" is not a Palindrome");
    }
    
}
