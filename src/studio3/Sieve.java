package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers do you want to check for prime-ness?");
		int n = in.nextInt();
		int y = 2;
		int[] array = new int[n];
		
			for(int i = 0; i < array.length; i++) {
				array[i] = i+1;	
			}
	while(y <= n) {
		for(int i = 0; i < array.length; i++)
			if (array[i] != y && array[i]%y == 0) {
				array[i] = 0;
			}
		y++;
	}
		
	for(int i = 0; i < array.length; i++) {
		if (array[i] != 0) {
			System.out.println(array[i]);
		}
		

	}
		
		
	}

}
