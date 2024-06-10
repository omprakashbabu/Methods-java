
/*Write a Java function (using function) that checks whether a given number is prime or not
(Note : function type - with arguments with return values)*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a number to check if it's a prime or not : ");  
	    int num = input.nextInt();
	    input.close();
	    if(isPrime(num)==true){
	        System.out.println("Prime number");
	    }else{
	        System.out.println("Not a prime number");
	    }
	    
	}
	public static boolean isPrime(int a){
	    
	    if(a<=1){
	        
	        return false;
	    }
	    else{
	        for(int i=2;i<a;i++){
	            if(a%2 == 0){
	                return false;
	            }
	            
	        }
	        return true;
	        
	    }
    }   
}

/* 

Sample output 1
Enter a number to check if it's a prime or not : 22
Not a prime number

Sample output 2
Enter a number to check if it's a prime or not : 23
Prime number

*/
	

