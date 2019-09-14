package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] fruit = {"banana","strawberry","apple", "mango", "pineapple",};
		//2. print the third element in the array
		System.out.println(fruit[3]);
		//3. set the third element to a different value
		fruit[3] = "blueberry";
		//4. print the third element again
		System.out.println(fruit[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i]);
		}
		
		//6. make an array of 50 integers
		int[] time = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < time.length; i++) {
			Random r = new Random();
			int t = r.nextInt(50);
			time[i] = t;
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(time[0]);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < time.length; i++) {
			System.out.println(time[i]);
		}
		//10. print the largest number in the array.
		System.out.println(time[49]);
	}
}
