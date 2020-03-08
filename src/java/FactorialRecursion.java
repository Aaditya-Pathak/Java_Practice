package java;
import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        FactorialRecursion f=new FactorialRecursion(); 
        int num;
        do{
        System.out.println("Enter number ");
        num=sc.nextInt();
        }while(num<=0);
        System.out.println("Factorial is "+f.fact(num));
    }
    public int fact(int n)
    {
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}
