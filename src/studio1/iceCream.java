package studio1;

import java.util.Scanner;

public class iceCream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int c = in.nextInt();
		System.out.println("Number of times eaten Ted Drews: " + c);
		

		String answer = in.next();
		System.out.println("Do you like Ted Drews? " + answer);
		
		int carPeople = in.nextInt();
		System.out.println("The number of people you can take in your car: " + carPeople);
		

		double priceOfCustard = in.nextDouble();
		System.out.println("The price of custard is: " + priceOfCustard);
		
		String favIceCream = in.next();
		System.out.println("Your favorite ice cream flavor: " + favIceCream);
		
		String address = in.next();
		System.out.println("Ted Drew's address: " + address);
		
		int numberOfTimesGone = in.nextInt();
		double probability = 0.50 * numberOfTimesGone;
		System.out.println("probability of seeing friends: " + probability);
		
		
		
		
		
		
		
		
		
		
	}

}
