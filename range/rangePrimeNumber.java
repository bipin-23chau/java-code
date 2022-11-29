package range;

import java.util.Scanner;

public class rangePrimeNumber {
    public static void main(String[] args) {
        int c=0;
        System.out.println("ENTER THE RANGE");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        for(int i=n;i<=m;i++){
            for(int j=1;j<=n*m;j++){
                if(i%j==0){
                    c++;
                }
            
            if(c==2)
            System.out.println(i);
            }
        }
    }
}