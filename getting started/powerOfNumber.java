import java.util.Scanner;


public class powerOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number and power:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int power=(int)Math.pow(n,p);
        System.out.println("POWER OF GIVEN NUMBER="+power);
    }
}
