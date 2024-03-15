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

		// 1-) byte data type : signed 1 Byte
		byte pbr = 45;
		byte minByte = -128;
		byte maxByte = 127;

		// Display byte data value
		System.out.println(pbr);
		System.out.println(minByte);
		System.out.println(maxByte);

		// 2-) short data type : signed 2 Byte
		short nbr = 45;
		short minShort = -32767;
		short maxShort = 32767;

		// Display short data value
		System.out.println(nbr);
		System.out.println(minShort);
		System.out.println(maxShort);

		// 3-) int data type : signed 4 Byte
		int age = 30;
		int year = 2024;
		int minInt = -2147483648;
		int maxInt = 2147483647;

		// Display int data value
		System.out.println(age);
		System.out.println(year);
		System.out.println(minInt);
		System.out.println(maxInt);

		// 4-) long data type : signed 8 Byte
		long xbr = 3000l;
		long minLong = -9223372036854775808l;
		long maxLong = 9223372036854775807l;

		// Display long data value
		System.out.println(xbr);
		System.out.println(minLong);
		System.out.println(maxLong);

		// 5-) char data type : unsigned 2 Byte
		char chr = '>';

		// Display char data value
		System.out.println(chr);

		// 6-) boolean data type : unsigned 1 Byte
		boolean red = true;
		boolean blue = false;

		// Display boolean data value
		System.out.println(red);
		System.out.println(blue);

		// 7-) float data type : signed 4 Byte
		float amount = 350.87f;

		// Display float data value
		System.out.println(amount);

		// 8-) double data type : signed 8 Byte
		double damount = 039457.9454;

		// Display double data value
		System.out.println(damount);

		/***********************
		 * 
		 * Non Primitive Data Types
		 * Reference / Objets
		 * 
		 ***********************/

		// 1-) String data type
		String name = "my name is so and so";

		// Display String data value
		System.out.println(name);
		
		/**some method which it is use with the string data type**/
		
		// lenght of the String
		int cpt = name.length();

		// Display lenght of the String
		System.out.println(cpt); 
		
		String str1 = "Hello World";
		String str2 = str1.toLowerCase();
		String str3 = str1.toUpperCase();
		int size = str1.length();
		
		//Display str1 convert to lowercase
		System.out.println(str2);
		//Display str1 convert to uppercase
		System.out.println(str3);
		//Dsplay the lenght of str1
		System.out.println(size);
		
		char ltr = str2.charAt(4);
		int id = str2.indexOf("world");
		
		// Display other method
		System.out.println(ltr);
		System.out.println(id);
		
		
		
		
	}

}
