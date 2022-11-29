import java.util.Scanner;

public class x_y_quadrant {
    public static void main(String[] args) {
       
        System.out.println("Enter the two qudrants ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>0 && y>0){
            System.out.println("first quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("second quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("third quadrant");
        }
        else{
            System.out.println("fourth quadrant");
        }
    }
}
