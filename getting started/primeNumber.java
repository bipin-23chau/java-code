import java.util.Scanner;

import java.util.*;
public class primeNumber {
    public static void main(String[] args) {
        int count=0;
        System.out.println("ENTER THE NUMBER:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0 || count==1){
            System.out.println(n+" not a prime number.");
        }
        else if(count>2){
            System.out.println(n+" not a prime number");
        }
        else{
            System.out.println(n+"is a prime number.");
        }
    }
}
