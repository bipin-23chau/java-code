import java.util.Scanner;

public class abundantNumber {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
            sum=sum+i;
        }
        if(sum>n){
            System.out.println("Abundant number");
            System.out.println("Abundanace: "+(sum-n));
        }
        else{
            System.out.println("Not Abundant number.");
        }
    }
}
