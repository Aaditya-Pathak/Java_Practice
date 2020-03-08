package java;
import java.util.Scanner;

public class PalindromeSentence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str;
        int flag=0;
        //input
        System.out.println("Enter Sentence to Check as Palindrome");
        str=sc.nextLine();
         
        int len=str.length();
        String str1="";
        
        //removing punctuation and space
            for(int k=0;k<len;k++)
            {
                char l=str.charAt(k);
                if((l>='a'&&l<='z')||(l>='A'&&l<='Z')){
                    str1=str1+l;
                }
            }
         
         System.out.println("String without spaces and Punctuatuion becomes "+str1);
        
        //formimg reverse
         
        int len1=str1.length();
        String rev= new String(str1);
        
            for(int i=0;i<len1;i++){
                char str_end=str1.charAt(len1-i-1);
                char rev_start=rev.charAt(i);
                rev_start=str_end;
            }
        
        System.out.println("Reverse of sentence After removing spaces and Punctuation is "+rev);
      
        
        //checking equality ignoring case
        int j;
        str1=str1.toLowerCase();
        rev=rev.toLowerCase();
        for(j=0;j<len1;j++)
        {
            char str_start=str1.charAt(j);
            char rev_start=rev.charAt(j);
            if(str_start!=rev_start)
            {
                flag++;
                break;
            }
        } 
       
        //checking pallindrome
        if(flag==0)
        {
            System.out.println("The sentence '"+str+"' is a palindrome sentence");
        }
        else
        {
            System.out.println("The sentence '"+str+"' is not a palindrome sentence");
        }
    }
}