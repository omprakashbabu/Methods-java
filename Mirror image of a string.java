//Write a Java program (using function) to print the mirror image of the given string.

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string to mirror : ");
		String str_0015 = input.nextLine();
		System.out.println("The reversed string is " + mirror_image(str_0015)); 
	}
	
	public static String mirror_image(String a){
	    String mirror="";
	    for(int i=a.length()-1 ; i>=0; i--){
	        mirror += a.charAt(i);
	    }
	    return mirror;
	}
}

/*  Output: 
Enter a string to mirror : Omprakash
The reversed string is hsakarpmO
*/
