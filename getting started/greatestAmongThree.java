import java.util.Scanner;

public class greatestAmongThree {
    public static void main(String[] args) {
        System.out.println("ENTER THE THREE:\n");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+" is greatest.");
            }
            else{
                System.out.println(c+" is greatest.");
            }
        }
        else{
            if(b>c){
                System.out.println(b+" is greatest.");
            }
            else{
                System.out.println(c+" is greatest.");
            }
        }

    }
    
}
