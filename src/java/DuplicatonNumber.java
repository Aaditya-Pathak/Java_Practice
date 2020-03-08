package java;
import java.util.Scanner;

public class DuplicatonNumber {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int i,len,a[];
        System.out.println("Enter size of array ");
        len=sc.nextInt();
        System.out.println("Enter the aray :");
        a=new int[len];
        for(i=0;i<len;i++)
        {
            a[i]=sc.nextInt();
        }
        
        //arranging array in ascending order ans simultaneously removing duplication in it
           
        int a1[]=new int [len];
        boolean add=true;
        int flag=1;
                
        for(i=0;i<len;i++)
        {
            for(int j=i;j<flag;j++)
            {
                if(a[i]>a[j])
                {  //swapping
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                
                else if(a[i]==a[j])
                {
                     add=false;  
                }
            }
            if(add==true){
                    a1[flag]=a[i];
                    flag++;
                    System.out.println(a1[flag]);
                }
        }
        
        System.out.println("The reduced array is ");
        for(i=0;i<flag;i++)
        {
            System.out.print(a1[i]);
        }
    }
}