package java;
import java.util.Scanner;

public class MaxDuplication {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int max=0;
        String s,s1;
        
        System.out.println("Enter a string");
        s=sc.next();
        int len=s.length();
        int count[];
        count=new int [len];
        //setting counter for each character
        for(i=0;i<len;i++)
        {
            count[i]=0;
            char ch1=s.charAt(i);
            for(j=0;j<len;j++)
            {
                char ch2=s.charAt(j);
                if(ch1==ch2)
                {
                    count[i]++;
                }
            }
        }
        
        //getting max dulpication char
        for(i=0;i<len-1;i++)
        {
            
            if(i==0)
                max=0;
            if(count[i]<count[i+1])
            {
                max=i+1;
            }
        }
        
        System.out.println("The maximum duplicated character is "+s.charAt(max)+" with "+count[max]+" duplications.");
    }
}
