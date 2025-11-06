package ComputerProgrammingPartOne;

import java.util.Objects;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// there are many built in methods and ways to compare strings in Java, let's
		// check them first.
		// later we will implement our own string_compare method

		String a = "aaa";
		String b = "aaa";
		String c = new String("aAa");
		String d = new String("aaa");
		String e = new String("aa");
		String f = new String("aaa");

		System.out.println(a.equals(c)); // false
		System.out.println(a.equals(b)); // true
		System.out.println(a.equals(d)); // true

		System.out.println(a.equalsIgnoreCase(c)); // true

		System.out.println(a == b); // true, because both refer to same instance
		System.out.println(a == d); // false, because d refers to instance created in non pool

		System.out.println(a.compareTo(b)); // 0, because a == b
		System.out.println(b.compareTo(d)); // 0, because b == d
		System.out.println(a.compareTo(e)); // 1, because a > e
		System.out.println(e.compareTo(a)); // -1, because e < a

		System.out.println(Objects.equals(d, f)); // true
		System.out.println(Objects.equals(d, c)); // false
		System.out.println(Objects.equals(d, e)); // false
		System.out.println(Objects.equals(a, b)); // true

		// our own compare method
		System.out.println(string_compare(a.toCharArray(), b.toCharArray())); // 0, because a == b
		System.out.println(string_compare(a.toCharArray(), e.toCharArray())); // 1, because a > e
		System.out.println(string_compare(e.toCharArray(), a.toCharArray())); // -1, because e < a
		System.out.println(string_compare(c.toCharArray(), a.toCharArray())); // -1, comparing the ASCII value 

	}

	static int string_compare(char a[], char b[]) {

		int i, val = 0;

		for (i = 0; i < a.length && i < b.length; i++) {
			if (a[i] < b[i]) {
				return -1;
			}
			if (a[i] > b[i]) {
				return 1;
			}
		}

		if (a.length == b.length) {
			val = 0;
		}

		if (a.length < b.length) {
			val = -1;
		}

		if (a.length > b.length) {
			val = 1;
		}
		return val;
	}

}
