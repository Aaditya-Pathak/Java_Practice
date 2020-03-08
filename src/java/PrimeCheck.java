package java;
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[]args)
    {
        //input & condition for input
        Scanner sc= new Scanner(System.in);
        int num,flag=0;
        do{
            System.out.println("Enter number : ");
            num=sc.nextInt();
            if(num<=0)
            System.out.println("The numbers are not Natural Please enter again !");
        }while(num<=0);
        
        //condition check
        
        if(num==0||num==1){
            System.out.println(num+" is not prime number");
        }
        
        else{
            
            for(int i=2;i<=num/2;i++){
                
                if(num%i==0){
                    System.out.println(num+" is not prime number");
                    flag=1;
                    break;
                }    
            }
            
            if(flag==0){ System.out.println(num+" is prime number"); }
        }
    }
}