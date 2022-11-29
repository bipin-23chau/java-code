import java.util.Scanner;

public class finoccai {
    public static void main(String[] args) {
        int a=0,b=1,f=0;
        System.out.println("ENTER THE Nth TERM:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1 ||n==0){
            System.out.print(a+",");
            System.out.print(b+",");
        }
        else{
        System.out.print(a+",");
        System.out.print(b+",");
        for(int i=2;i<=n;i++)
		{
			int temp=a+b;
		 
			a=b;
			b=temp;
            System.out.print(temp+',');
		}
        }
    }
}
