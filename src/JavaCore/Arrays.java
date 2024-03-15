package JavaCore;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 
		 * Static Array use with primitive data type Primitive type Array
		 * 
		 */

		// Array declaration with initialisation
		int[] intArray = { 10, 20, 30, 40, 50 };
		/*
		 * int x = intArray[0]; System.out.println(x);
		 */

		// Display array directly
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);

		// double Array declaration
		double[] doubleArray = { 3.2, 5.8, 9.7, 10.15 };
		// Display double Array at 0 index
		System.out.println(doubleArray[0]);

		// String Array declaration
		String[] stringArray = { "happy", "jonathan", "john", "naomi" };
		// Display String Array at 0 index
		System.out.println(stringArray[0]);

		// change the value in Array
		intArray[1] = 100;
		// Display the new value in Array at the index 1
		System.out.println(intArray[1]);

	}

}
