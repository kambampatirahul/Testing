package basicprg;

import java.util.Scanner;

public class reverse {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=String.valueOf(n);
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.reverse());
	}
}
