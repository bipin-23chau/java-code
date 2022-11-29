import java.util.Scanner;

public class greatestAmongTwo {
    public static void main(String[] args) {
        System.out.println("ENTER THE TWO NUMBER:\n");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a+" is greatest.");
        }
        else{
            System.out.println(b+" is greatest.");
        }
    }
}
