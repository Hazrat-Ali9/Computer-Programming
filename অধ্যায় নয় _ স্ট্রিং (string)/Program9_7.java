package ComputerProgrammingPartOne;

public class Program9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we can actually concatenate two strings like str1 + str2 in Java
		// we can also do it like the way it is shown in the book using C

		// Java way
		/*
		 * String str1 = "bangla"; String str2 = "desh";
		 * 
		 * String str3 = str1 + str2;
		 * 
		 * System.out.printf("%s\n", str3);
		 */

		// C way
		char[] str1 = { 'b', 'a', 'n', 'g', 'l', 'a' }, str2 = { 'd', 'e', 's', 'h' }, str3 = new char[12];

		int i, j, length1 = 6, length2 = 4;

		for (i = 0, j = 0; i < length1; i++, j++) {
			str3[j] = str1[i];
		}

		for (i = 0; i < length2; i++, j++) {
			str3[j] = str2[i];
		}

		/*
		 * Java doesn't "mark" the end-of-string as C does. It tracks length & values,
		 * so it's possible to have zero-chars (\0) in the string. If we create a String
		 * from a char array containing \0 chars, the resultant String will contain
		 * those characters.
		 */

		System.out.printf("%s\n", String.valueOf(str3));

	}

}
