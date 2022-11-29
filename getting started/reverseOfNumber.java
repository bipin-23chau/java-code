import java.util.Scanner;

public class reverseOfNumber {
    public static void main(String[] args) {
        int rev=0;
        System.out.println("ENTER THE NUMBER:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0){
            int d=n%10;
             rev=rev*10+d;
            n=n/10;
        }
        System.out.println("REVERSE OF NUMBER="+rev);
    }
}
