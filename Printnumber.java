package com.jsp.utility;

import java.util.Scanner;

public class Printnumber {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enetr a size");
		int n = x.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				int y = ((i - 1) * n) + 1;
				for (int j = 1; j <= n; j++) {
					System.out.print(y++);
					System.out.print("\t");
				}
			} else {
				int y = i * n;
				for (int j = 1; j <= n; j++) {
					System.out.print(y--);
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

}
