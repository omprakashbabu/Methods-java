import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements to be stored : ");
		int n = input.nextInt();
		System.out.println("Enter "+n+" integers : ");
		int arr[] = new int[100];
		
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
