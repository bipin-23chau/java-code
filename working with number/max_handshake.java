import java.util.Scanner;

public class max_handshake {
    public static void main(String[] args) {
        int hs=0;
        System.out.println("enter the number people");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        hs=((n-1)*n)/2;
        System.out.println("number of hand shake="+hs);
    }
}
