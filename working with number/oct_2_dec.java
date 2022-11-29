import java.util.Scanner;

public class oct_2_dec {
    public static void main(String[] args) {
        int n,dec=0,i=0;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=n;
        while(n!=0){
            int d=n%10;
            dec=dec+d*(int)Math.pow(8,i);
            n=n/10;
            i++;
        }
        System.out.println("decimal of ("+temp+")8=("+dec+")10");
    }
}
