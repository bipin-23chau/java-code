import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        int fact=1,sum=0;
        System.out.println("ENTER THE NUMBER");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        while(n!=0){
            int d=n%10;
            fact=1;
            for (int i = 1; i<=d; i++) {
                fact=fact*i;
            }
             sum=sum+fact;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not strong number");
        }
    }
}
