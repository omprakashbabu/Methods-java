
//Write a Java program (using function) to print the even numbers from a given list.
//(Note : function type - with arguments but no return values)

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements to be stored : ");
		int n = input.nextInt();
		System.out.println("Enter "+n+" integers : ");
		int arr[] = new int[100];b
		
		for(int i=0;i<n;i++){
		    arr[i] = input.nextInt();
		}
		System.out.println("The even numbers are ");
		even_num(arr,n);
		
	}
	
	public static void even_num(int arr[], int n){
	    for(int i=0;i<n;i++){
            	if(arr[i] % 2 == 0){
                    System.out.println(arr[i]);
            	}
	    }
	} 	    
}

/*
Output
Enter the number of elements to be stored : 5
Enter 5 integers : 
1
2
4
3
6
The even numbers are 
2
4
6
*/
