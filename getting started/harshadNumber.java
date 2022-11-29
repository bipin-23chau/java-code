import java.util.Scanner;

public class harshadNumber {
    public static void main(String[] args) {
        int sum=0,d;
        System.out.println("ENTER THE NUMBER:");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int temp1=n;
        while(n!=0){
            d=n%10;
sum=sum+d;
n=n/10;
        }
        if(temp1%sum==0){
            System.out.println("Harshad's Number");
        }
        else{
            System.out.println("Not Hrashad's number.");
        }
    }
}
