import java.util.Scanner;
import java.lang.Math;
public class armstrong {
    public static void main(String[] args) {
        int c=0,sum=0;
        System.out.println("ENTER THE NUMBER:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int temp1=n;
        while(n!=0){
            
            c++;
            n=n/10;
        }       
        while(temp!=0){
            int d1=temp%10;
            sum=d1+(int)Math.pow(d1,c);
            temp=temp/10;
        }
        if(sum==temp1){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not armstrong number");
        }
    }
}
