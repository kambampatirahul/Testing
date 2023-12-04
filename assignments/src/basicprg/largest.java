package basicprg;

import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i:arr) {
			if(i>max)max=i;
			System.out.println(i);
		}
		System.out.println(max);
	}

}
