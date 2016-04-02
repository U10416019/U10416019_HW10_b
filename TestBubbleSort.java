//U10416019鄭文琪

import java.util.Scanner;

public class TestBubbleSort{
	public static void main(String[] args){
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//let the user enter how many numbers want to enter
		System.out.print("How many numbers do you want to enter ?");
		int number = input.nextInt();
		
		//let the number to be the length of the bubble array
		int[] bubble = new int[number];
		
		//let the user enter the numbers
		System.out.println("Please enter the numbers you want.");
		//input the numbers in array
		for(int i = 0; i < bubble.length; i++){
			bubble[i] = input.nextInt();
		}
		
		//print the numbers which the user input
		System.out.println("The numbers you enter is");
		for(int i = 0; i < bubble.length; i++){
			System.out.print(bubble[i] + " ");
		}
		
		System.out.println("");
		
		//create a variable bubbleSort to call BubbleSort class
		BubbleSort bubbleSort = new BubbleSort(number, bubble);
	}
}