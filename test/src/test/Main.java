package test;


/*
All submissions for this problem are available.
An array a is called beautiful if for every pair of numbers ai, aj, (i != j), there exists an ak such that ak = ai * aj. Note that k can be equal to i or j too.

Find out whether the given array a is beautiful or not!

Input
First line of the input contains an integer T denoting the number of test cases. T test cases follow.

First line of each test case contains an integer n denoting number of elements in a.

Next line contains n space separated integers denoting the array a.

Output
For each test case, output a single line containing "yes" or "no" (without quotes) corresponding to the answer of the problem.

Constraints
1 <=T <= 106
1 <= n <= 105
Sum of n over all the test cases <= 106
-109 <= ai <= 109
*/
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) throws Exception{
		 Scanner in = new Scanner(System.in);
		 int count = in.nextInt();		
		 if (count <1  || count >1000000){
				throw new Exception("Exceeded the specified limit");
			}
		 int input[][]=new int[count][];
		 // reading the input from user
		for (int i = 0; i < count; i++) {
			int size = in.nextInt();
			
			int[] numbers = new int[size];
			for (int j = 0; j < size; j++) {
				if (in.hasNextInt()) {
					numbers[j] = in.nextInt();
				} else {
					System.out.println("You didn't provide enough numbers");
					break;
				}
			}
			input[i] = numbers;
		}
		 
	//	 System.out.println(Arrays.deepToString(input));
		 
		 
	 String [] result = new String[count];
	 for(int i=0;i<count;i++){
		 int[] numbers = input[i];
		 boolean found=false;
		 for(int j=0;j < numbers.length && !found;j++){
			 for(int k=j+1;k<numbers.length;k++){
				 int temp=numbers[j]*numbers[k];
				 //System.out.print(temp+ ",");
				 if(Arrays.stream(numbers).anyMatch(l -> l == temp)){
				 result[i]="yes";
				 found=true;
				 break;				
				 }
			 }
			 System.out.println();
		 }
		 if(!found)
			 result[i]="no";
	 }
	 
	 for(int i =0; i< count;i++){
		 System.out.println(result[i]);
	 }
	 
	 
	}
}
