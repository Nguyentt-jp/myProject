package Paiza.jp;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		
		Scanner sC=new Scanner(System.in);
//		int a=sC.nextInt();
//		int b=sC.nextInt();
//		int c=sC.nextInt();
		int day=sC.nextInt();
		int[][] dayArr=new int [day][2];
		for (int i = 0; i < day; i++) {
			for (int j = 0; j < 2; j++) {
				dayArr[i][j]=sC.nextInt();				
			}
			
		}
		for (int i = 0; i < day; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(dayArr[i][j]);				
			}	
			System.out.println();
		}
	}

}
