import java.util.Scanner;

import comp.anupam.Functions;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int numbers[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for (i = 0; i < 5; i++) {
			numbers[i] = sc.nextInt();
			
		}
		System.out.println("Enter 1 for Ascending and 0 for Descending");
		int flag=sc.nextInt();

		Functions f = new Functions();
		f.sort(numbers, flag);
	}

}
