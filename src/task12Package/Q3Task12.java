package task12Package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Q3Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> empTree = new TreeMap<Integer, String>();
		empTree.put(1001, "Zana");
		empTree.put(1002, "Mugilan");
		empTree.put(1003, "Uri");
		empTree.put(1004, "Abi");
		empTree.put(1005, "Sam");

		// Printing values before Alphabetical sorting of names
		System.out.println("Employee name before Alphabetical sorting: ");
		System.out.println(empTree);
		System.out.println("------------------------------------------");

		// Get all entries from the Tree map
		Set<Entry<Integer, String>> entrySet = empTree.entrySet();

		// Array list to pass all the entry set into it
		List<Entry<Integer, String>> list = new ArrayList<>(entrySet);

		// Collections to sort the list using comparator interface
		Collections.sort(list, (p1, p2) -> p1.getValue().compareTo(p2.getValue()));

		System.out.println("Employee name after Alphabetical sorting: ");
		// For each loop to iterate over the sorted values
		list.forEach(sorted -> System.out.println(sorted.getValue()));
	}

}
