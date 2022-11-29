import java.util.*;

public class sumOfDigit {
    public static void main(String[] args) {
        int sum=0;
    System.out.println("ENTER THE NUMBER:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n!=0){
        int d=n%10;
           sum=sum+d;
        n=n/10;
    }
    System.out.println("SUM OF DIGIT="+sum);
    }
}
