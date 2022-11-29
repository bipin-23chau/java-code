import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int fact=1;
        System.out.println("ENTER THE NUMBER");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;
            System.out.print(fact+",");
        }
        System.out.println("FCATORIAL OF "+n+ "is "+fact);
    }
}
