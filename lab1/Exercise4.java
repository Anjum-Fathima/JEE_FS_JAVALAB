/**
 *Write a Java program that prompts the user for an 
 *integer and then prints out all the prime numbers up to that Integer? 
 */
import java.util.Scanner;
class Exercise4
{
	public static void main (String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
	    int last =sc.nextInt();
	    prime(last); 
	}  
 public static void prime(int n) 
{ 
    int i, j, flag; 
     for (i = 1; i <= n; i++) 
    { 
            if (i==1||i==0) 
            continue; 
            flag = 0; 
 
        for (j=2;j<=i/2;j++) 
        { 
            if (i%j==0)
            { 
                flag = 1; 
                break; 
            } 
        } 
        if (flag==0) 
            System.out.println(i);
    } 
} 
}