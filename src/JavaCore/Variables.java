/**
 * 
 */
package JavaCore;

/**
 * 
 */
public class Variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/***********************
		 * 
		 * Primitive Data Types
		 * 
		 ***********************/

		// 1-) byte data type : 2 Byte
		byte pbr = 45;
		byte minByte = -128;
		byte maxByte = 127;

		// Display short data value
		System.out.println(pbr);
		System.out.println(minByte);
		System.out.println(maxByte);

		// 2-) short data type : 2 Byte
		short nbr = 45;
		short minShort = -32767;
		short maxShort = 32767;

		// Display short data value
		System.out.println(nbr);
		System.out.println(minShort);
		System.out.println(maxShort);

		// 3-) int data type : 4 Byte
		int age = 30;
		int year = 2024;
		int minInt = -2147483647;
		int maxInt = 2147483647;

		// Display int data value
		System.out.println(age);
		System.out.println(year);
		System.out.println(minInt);
		System.out.println(maxInt);

		// 4-) long data type : 8 Byte
		long xbr = 3000;
		long minLong = -9223372036854775808l;
		long maxLong = 9223372036854775807l;

		// Display long data value
		System.out.println(xbr);
		System.out.println(minLong);
		System.out.println(maxLong);

		// 5-) char data type : 2 Byte
		char chr = '>';

		// Display char data value
		System.out.println(chr);

		// 6-) boolean data type
		boolean red = true;
		boolean blue = false;

		// Display boolean data value
		System.out.println(red);
		System.out.println(blue);

		// 7-) flot data type
		float amount = 350.87f;

		// Display boolean data value
		System.out.println(amount);

		// 8-) double data type
		double damount = 039457.9454;

		// Display boolean data value
		System.out.println(damount);

		/***********************
		 * 
		 * Non Primitive Data Types
		 * Reference / Objets
		 * 
		 ***********************/

		// 1-) String data type
		String name = "my name is so and so";

		// Display boolean data value
		System.out.println(name);

		// lenght of the String
		int cpt = name.length();

		// Display lenght of the String
		System.out.println(cpt); 
	}

}
