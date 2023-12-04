package basicprg;

import java.util.Scanner;

public class repeat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.nextLine();
		char c=sc.next().charAt(0);
		int max=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c)max++;
			//System.out.println(i);
		}
		System.out.println(max);
}
}