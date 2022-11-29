import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        int gcd=1;
        System.out.println("Enter the two number.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=n || i<=m;i++){
            if(n%i==0 && m%i==0){
                 gcd=i;
            }
        }
        System.out.println("Greatest common factors are:"+gcd);
    }
}
