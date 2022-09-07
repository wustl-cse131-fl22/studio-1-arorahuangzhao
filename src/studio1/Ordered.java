package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();

		boolean order1 = x < y && y < z; 
		System.out.println (order1);
		
		boolean order2 = z < y && y < x; 
		System.out.println (order2);	
		
		boolean isOrdered = order1 || order2;
		System.out.println(isOrdered);
	
	

	}

}
