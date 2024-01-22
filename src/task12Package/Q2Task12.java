package task12Package;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Declaring an Array list of type string
		ArrayList<String> Str = new ArrayList<>();

		// Get the string values to be stored in the array list
		System.out.println("Please enter some names with space in a single line : ");
		String names = sc.nextLine();

		// Using split method to split each names
		String[] namesArray = names.split(" ");

		for (int i = 0; i < namesArray.length; i++) {
			Str.add(namesArray[i]);
		}

		System.out.println("------------------------------------------");

		System.out.println("The names in the Array List before using removeAll()");
		System.out.println(Str + " ");

		System.out.println("------------------------------------------");
		// Remove all elements in the array list
		Str.removeAll(Str);

		System.out.println("The names in the Array List after using removeAll()");
		System.out.println(Str + " ");

	}

}
