import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==temp){
              System.out.println("Perfect number.");
        }
        else{
            System.out.println("Not Perfect  number.");
        }
    }
}
