package learning.array;

import java.util.Scanner;

public class Fibo {
	static Scanner s = new Scanner(System.in);
	static int n = s.nextInt();

	public static long fibo(int n) {

		if (n == 0) {
			return 0;

		} else if (n == 1) {
			return 1;
		}
		long a = 0;
		long b = 1;
		long c = 0;

		for (int i = 1; i < n; i++) {
			c = a + b;
			a = b;
			b = c;

		}
		return c;
	}

	public static void main(String[] args) {

		for (int i = 0; i < n; i++) {
			System.out.println(Fibo.fibo(i));
		}

	}

}
