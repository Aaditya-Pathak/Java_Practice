package java;
import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[]args)
    {
        boolean x;
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter number to check for armstrong ");
        num=sc.nextInt();
        x=checkarm(num);
        if(x==true)
            System.out.println(num+" is an Armstrong Number");
        else
            System.out.println(num+" is not an Armstrong Number");
    }
    
    public static boolean checkarm(int n)
    {
        int sum=0;
        int num=n;
        while(n>0)
        {
            int i=n%10;
            n=n/10;
            sum=sum+i*i*i;
        }
        if(sum==num)
            return true;
        else
            return false;
    }
}
