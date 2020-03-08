package java;
import java.util.Scanner;

public class PowerRecursion {
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        int num,pow;
        PowerRecursion p=new PowerRecursion();
        do{
        System.out.println("Enter number ");
        num=sc.nextInt();
        System.out.println("Enter power ");
        pow=sc.nextInt();
        }while((num<=0||pow<=0)||(num<=0&&pow<=0));
        System.out.println("Requires value is "+p.power(num,pow));
    }
    public int power(int num,int pow){
        if(pow==0)
            return 1;
        else
            return num*power(num,pow-1);
    } 
}
