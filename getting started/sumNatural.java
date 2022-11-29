import java.util.Scanner;
import java.util.*;
public class sumNatural {
    public static void main(String[] args) {
        int sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("ENTER THE NUMBER.\t");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++){
          sum=sum+i;
      }  
      System.out.println("SUM OF N NATURAL NUMBER="+sum);
    }
}
