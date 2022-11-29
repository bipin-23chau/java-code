import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        int hcf=0;
        System.out.println("Enter the two number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int minn=Math.min(n,m);
        for(int i=1;i<=minn;i++){
            if(n%i==0 && m%i==0){
                hcf=i;
            }
        }
        System.out.println("HCF of the number is:= "+hcf);
    }
}
