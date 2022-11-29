import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        int lcm=0;
        System.out.println("enter the two number.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int max=Math.max(n,m);
        for(int i=max;i<=n*m;i++){
            if(i%n==0 && i%m==0){
                lcm=i;
            }
        }
        System.out.println("LCM ="+lcm);
    }
}
