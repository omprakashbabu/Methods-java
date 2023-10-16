
/*  Write a Java function (using function) that checks whether a passed string is palindrome or
not. (Note : function type - No arguments with return values)  */

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    if(palindrome()){
	        System.out.println("TRUE");
	    }
	    else{
	        System.out.println("FALSE");
	    }
	    
  }
	public static boolean palindrome(){
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter a string to check if it's a palindrome : ");
	    String str = input.nextLine();
	    String lowerCase = str.toLowerCase();
	    input.close();
	    String reverse = "";
	    for(int i=lowerCase.length()-1;i>=0;i--){
	        reverse += lowerCase.charAt(i);
	    }
	    if(lowerCase.equals(reverse)){
	        return true;
	    }else{
	        return false;
	    } 
  }
		
}


/*  Sample output 1:

Enter a string to check if it's a palindrome : Malayalam
TRUE

Sample output 2:

Enter a string to check if it's a palindrome : Omprakash
FALSE

*/
	        
	        
	    
	
