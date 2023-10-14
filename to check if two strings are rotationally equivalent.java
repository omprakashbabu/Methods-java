
//Write a Java program (using function) to check if two strings are rotationally equivalent.

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string to mirror : ");
		String str_0015 = input.nextLine();
		String lowerCase = str_0015.toLowerCase();
		System.out.println("The reversed string is " + mirror_image(lowerCase));
		
		if (lowerCase.equals(mirror_image(lowerCase))){
		    System.out.println("The given is rotationally equivalent");
		}
		else{
		    System.out.println("The given string is rotationally not equivalent");
		}
	}
	
	public static String mirror_image(String a){
	    String mirror="";
	    for(int i=a.length()-1 ; i>=0; i--){
	        mirror += a.charAt(i);
	    }
	    return mirror;
	}
}


/*
sample output 1
Enter a string to mirror : hari
The reversed string is irah
The given string is rotationally not equivalent

sample output 2
Enter a string to mirror : Malayalam
The reversed string is malayalam
The given is rotationally equivalent
*/
