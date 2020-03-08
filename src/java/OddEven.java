/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

/**
 *
 * @author aditya
 */
public class OddEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      for(int i=1;i<=100;i++)
      {
          if(i%2==0)
          {
              System.out.print(i+" is Even\n");
              
          }
          else{
              
              System.out.print(i+" is odd\n");
             
          }
          
           if(i%5==0)
                  System.out.print(i+" is Divisible by 5\n");
      }
    }
    
}
