import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sss = new Scanner(System.in);
        int number = sss.nextInt();
        String digit = Integer.toString(number);
        int count = digit.length();
        int rem = 0;
        int total = 0;
        int num = number;

        while (num > 0) {
            rem = num%10;
            total += Math.pow(rem,count);
            num = num / 10;            
        }
        if (total == number) {
            System.out.print(number+" It is a Armstrong Number");
        }
        else
        System.out.print(number+" It is not a Armstrong Number");
    }
}
