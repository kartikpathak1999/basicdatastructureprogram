package importantprograms;

import java.util.Scanner;



import java.util.LinkedList;

public class LinkedListodd {

	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		
	
	
	LinkedList<Integer>numbers=new LinkedList<Integer>();
	
	
	System.out.println("Enter the no of elements ");
	int n= sc.nextInt();
	
	System.out.println(" enter "+n+"elements");
	
	for(int i=0;i<n;i++) {
		
		int num=sc.nextInt();
		
		numbers.add(num);
	
	}
	
	
	System.out.println("Odd numbers in the list:");
	
	for(int num:numbers) {
	 if(num%2!=0) {
		 
		 System.out.println(num+ "");
		 
	 }
	
	
	}
		
		
		
		
	}
}
