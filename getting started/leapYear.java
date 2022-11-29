import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        System.out.println("ENTER THE YEAR:\t");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println(year+" is a leap year.");
        }
        else{
            System.out.println(year+" not a leap year.");
        }
    }
    
}
