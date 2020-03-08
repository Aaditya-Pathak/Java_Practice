
package java;
import java.util.Scanner;

public class PrimeCheckRange {
    public static void main(String[]args)
    {
        //input & condition for input
        Scanner sc= new Scanner(System.in);
        int num1,num2;
        int flag=0;
        System.out.println("Enter range to check prime numbers in :");
        do{
            System.out.print("Enter Starting number : ");
            num1=sc.nextInt();
            System.out.print("Enter Ending number : ");
            num2=sc.nextInt();
            if(num1<=0&&num2<=0)
            System.out.print("\nThe numbers are not Natural Please enter again !\n\n");
            if(num1>num2)
            System.out.print("\nInvalid range Please enter again !\n\n");
        }while(((num1<=0||num2<=0)||(num1<=0&&num2<=0))&&(num1<num2));
        
        //condition to check and print output
        
        for(int i=num1;i<=num2;i++)
        {
            flag=0;
            if(i==0||i==1){  
              System.out.println(i+" is not prime number");      
             }
            
            else{  
                     for(int j=2;j<=i/2;j++){      
                        if(i%j==0){      
                            System.out.println(i+" is not prime number");      
                            flag=1;      
                            break;      
                            }      
                        }      
            if(flag==0){ 
                System.out.println(i+" is prime number"); }  
            }
        }
    }
}
