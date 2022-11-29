import java.text.DecimalFormat;
import java.util.Scanner;

public class bin_2_dec {
    public static void main(String[] args) {
        int n,dec=0,i=0;
        System.out.println("enter the binary number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=n;
        while(n!=0){
            int d=n%10;
            dec=dec+d*(int)Math.pow(2,i);
            n=n/10;
            i++;
        }
        System.out.println("Decimal of ("+temp+")2 = ("+dec+")10");
    }
}
