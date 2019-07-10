package com.visa.prj.client;

import java.util.Arrays;

public class ArrayClient {

	public static void main(String[] args) {
		String[] names = { "Calvin", "Geaorge", "Lee", "Angelina", "Brad" };

		// Arrays.sort(names);
		/*
		 * Arrays.sort(names, new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { 
		 * return o1.length() - o2.length(); 
		 * } 
		 * });
		 */
		
		//Lambda Expression
		Arrays.sort(names, (o1,o2) -> o1.length() - o2.length());
		
		for (String name : names) {
			System.out.println(name);
		}
	}

}
