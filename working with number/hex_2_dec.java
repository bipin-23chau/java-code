import java.util.Scanner;

public class hex_2_dec {
    public static void main(String[] args) {
        int dec=0;
        System.out.println("enter the hexadecimal number:");
        Scanner sc=new Scanner(System.in);
       String n=sc.next();
       for(int i=0;i<=n.length();i++){
           char s=n.charAt(i);
           if(s=='A'||s=='B'||s=='C'||s=='D'||s=='E'||s=='F'){
            int a='s';
            System.out.println(a);
           }
       }
    }
}
