package java;
import java.util.Scanner;

public class NumRev {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=0;
        int rev=0;
        
        //input
        System.out.println("Enter Number to Reverse ");
        num=sc.nextInt();
        
        //reverse logic
        while(num!=0){
            int i= num % 10;
            num= num / 10;
            rev= rev*10 +i;
        }
        
        //printing reverse of string
        System.out.println("The reverse of entered number is "+ rev);
    }
}
