package java;
import java.util.Scanner;
/**
 *
 * @author aditya
 */
public class RemoveDup_andStart_n_End {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s,s1="";
        System.out.println("Enter the string to reduce ");
        s=sc.next();
        
        char[] array1 = s.toCharArray();
        char []array2=new char[array1.length];
        array2[0]=array1[0];
        int flag=1;
        
        for (int i = 0; i < array1.length; i++) {
            char c = array1[i];
            boolean add = true;

            for (int j = 0; j < flag; j++) {
                if (array2[j] == c) {
                    add = false;
                    break;
                }
            }

            if (add) {
                array2[flag] = c;
                flag++;
            }

        }
        //converting chararray to string of length from start of araay2 to flag only
        String finalValue = new String(array2, 0, flag);
        System.out.println("Reduced string is : "+finalValue+"\n");
        
        System.out.println("Starting character of reduced string is : "+finalValue.charAt(0));
        System.out.println("Ending character of reduced string is : "+finalValue.charAt(flag-1));
    }
}
