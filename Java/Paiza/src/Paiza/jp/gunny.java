package Paiza.jp;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class gunny {
	
	public static void showSize(int n, int b,int a) {


		String[] aArr=new String[a];
		for(int i=0;i<aArr.length;i++) {
			aArr[i]="_";
		}
		aArr[n]="ðŸ’©";
		int s = a-b;
		aArr[s]="ðŸ’£";

		System.out.println("\n\n");
		System.out.print("ðŸ‘¥");
		for (String string : aArr) {
			System.out.print(string);
		}
		System.out.println("ðŸ‘¯");
		System.out.println("\n");
	}

	public static void main(String[] args) {

		System.out.println("ðŸ‘¥=====>âœ‹ðŸ’©");
		System.out.println("ðŸ‘¯=====>âœ‹ðŸ’£");
		System.out.println("===================");
		System.out.println("自分達は５回をします。\n誰の点数一番が低いのを勝ちます。");
	
		Scanner sc = new Scanner(System.in);
		Random rD=new Random();
		int times=1;
		int countA=0;
		int countB=0;
		while(true) {
			System.out.println("Times: "+times);
			int a=rD.nextInt(30)+70;
			System.out.println("Distance: "+a);
			// A
			int AB;
			int s=0;
			
			while (true) {
				System.out.println("input radian for A");
				int acuteAngleA = sc.nextInt();
				System.out.println("input forces fired for A");
				int powerA = sc.nextInt();

				// Ä‘Æ°a 1 gÃ³c vá»� radian
				double radian = Math.PI * powerA / 180;
				AB = (int) Math.round(acuteAngleA / Math.cos(radian));
				System.out.println(AB);				
				if (AB<a) {
					s=a-AB;
					countA+=s;	
					break;	
				}				
			}
			// B
			int BA;
			int n=0;
			while(true) {
				System.out.println("input radian for B");
				int acuteAngleB = sc.nextInt();
				System.out.println("input forces fired for B");
				int powerB = sc.nextInt();
				// Ä‘Æ°a 1 gÃ³c vá»� radian
				double radian = Math.PI * powerB / 180;
				BA = (int) Math.round(acuteAngleB / Math.cos(radian));
				System.out.println(BA);				
				if (BA<a) {
					n=a-BA;
					countB+=n;
					break;
				}				
			}
			showSize(AB,BA,a);
			times++;
			if(times>5) break;
		}
		System.out.println("Point A: "+countA);
		System.out.println("Point B: "+countB);
		if (countA<countB) {
			System.out.println("A is Winner!");
		}
		else {
			System.out.println("B is Winner!");
		}
	}
}
