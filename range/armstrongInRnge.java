
import java.util.Scanner;

public class armstrongInRnge {

    public static void main(String[] args) {
        int c=0,sum=0;
        System.out.println("ENTER THE NUMBER:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
        int temp=i;
        int temp1=i;
        while(i!=0){
            
            c++;
            i=i/10;
        }
        
        while(temp!=0){
            int d1=temp%10;
            sum=d1+(int)Math.pow(d1,c);
            temp=temp/10;
        }
        if(sum==temp1){
            System.out.println(i);
        }
    }
    }
}

