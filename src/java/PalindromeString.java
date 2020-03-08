package java;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str;
        
        //input
        System.out.println("Enter String to Check from Palindrome");
        str=sc.next();
        
        //finding reverse and checking palindrome
        int length=str.length();
        int flag=0;
        name:
        for(int i=0;i<=length/2;i++)
        {
            
            char a=str.charAt(i);
            char b=str.charAt(length-i-1);
            if(a!=b){
                flag++;
                break name;
            }
        }
        
        
        if(flag>0){
            System.out.println("The String "+str+" is not a Palindrome.");
        }
        else
        {
            System.out.println("The String "+str+" is a Palindrome.");
        }
    }
}
