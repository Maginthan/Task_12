package task12Package;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Q4Task12 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Declaring an Array list of type string
		List<String> Str = new LinkedList<String>();

		int size = 5;

		// Get the string values to be stored in the array list
		System.out.println("Please enter five contury names : ");

		for (int i = 0; i < size; i++) {
			Str.add(sc.next());
		}
		System.out.println("------------------------------------------");
		System.out.println("Before converting the List to Array: ");
		System.out.println(Str);
		System.out.println("------------------------------------------");

		// Converting list to array using toArray()
		String[] arr = Str.toArray(new String[0]);

		System.out.println("After converting the List to Array: ");

		// For each loop for printing array of elements in console
		for (String str : arr) {
			System.out.println(str + " ");
		}

	}

}
