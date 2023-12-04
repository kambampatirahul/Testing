package basicprg;

import java.util.Scanner;
import java.util.Random;

public class random {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Random r=new Random();
		System.out.println(r.nextInt(n));
	}
}
