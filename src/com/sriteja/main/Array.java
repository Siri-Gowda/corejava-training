package com.sriteja.main;



	public class Array {
		static void min(int arr[]) {
			int min = arr[0];
			for (int i = 1; i < arr.length; i++)
				if (min > arr[i])
					min = arr[i];
			System.out.println(min);
		}

		public static void main(String args[]) {
			int a[] = { 14, 9, 7, 5, 2 };
			min(a);
		}

	}



