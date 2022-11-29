import java.util.Scanner;

public class dec_to_bi {
    public static void main(String[] args) {
         
        System.out.println("enter the decimal number:");
        Scanner sc=new Scanner(System.in);
        int dec=sc.nextInt();
        while(dec!=0){
            int d=dec%2;
            System.out.print(d);
            dec=dec/2;
        }
    }
}
