
package java;
import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numcheck;
        int rev=0;
        //input number
        System.out.println("Enter number to check as palindrome");
        numcheck=sc.nextInt();
        int num=numcheck;
        //palindrome check
        while(num!=0)
        {
          int i = num % 10;
          num = num / 10;
          rev= rev*10 + i;
        }
        
        //print output
        System.out.println("The reverse of number entered is "+rev);
        if(numcheck==rev)
            System.out.println("The number "+numcheck+" is Palindrome.");
        else
            System.out.println("The number"+numcheck+"is not palindrome");
    }
}
