import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int temp=0,rev=0;
        System.out.println("ENTER THE NUMBER:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        temp=n;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(rev==temp){
            System.out.println("Palindrome number.");
        }
        else{
            System.out.println("Not palindrome number.");
        }
    }
}
