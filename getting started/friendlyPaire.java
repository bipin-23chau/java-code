import java.util.Scanner;

public class friendlyPaire {
    public static void main(String[] args) {
        int sum1=0,sum2=0;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum1=sum1+i;
            }
        }
        for(int j=1;j<=m/2;j++){
            if(m%j==0){
                sum2=sum2+j;
            }
        }
        if((sum1/n)==(sum2/m)){
            System.out.println("Friendly number");
        }
        else{
            System.out.println("not friendly number.");
        }
    }
}
