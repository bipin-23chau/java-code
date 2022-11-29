import java.util.Scanner;

import java.util.*;

public class sumOfNumber_Range {
 public static void main(String[] args) {
     int sum=0;
     System.out.println("ENTER THE RANGE:\n");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int m=sc.nextInt();
     for(int i=n;i<=m;i++){
         sum=sum+i;
     }
     System.out.println("SUM OF NUMBER IN A GIVEN RANGE="+sum);
 }   
}
