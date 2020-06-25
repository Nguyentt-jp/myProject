package Game;

import java.util.Random;
import java.util.Scanner;

public class Gunny {

	public static void showSize(int n, int b,int a) {


		String[] aArr=new String[a];
		for(int i=0;i<aArr.length;i++) {
			aArr[i]="_";
		}

		for (int i = n; i < aArr.length; i++) {
			if(n==i) {
				aArr[i]="💩";
				break;
			}
		}
		int s = a-b;
		for (int i = s; i < aArr.length; i++) {
			if(s==i) {
				aArr[i]="💣";
				break;
			}
		}

		System.out.println("\n\n");
		System.out.print("👥");
		for (String string : aArr) {
			System.out.print(string);
		}
		System.out.println("👯");
		System.out.println("\n");
	}


	public static void main(String[] args) {

		System.out.println("👥=====>✋💩");
		System.out.println("👯=====>✋💣");

		Scanner sc = new Scanner(System.in);
		Random rD=new Random();
		int a=rD.nextInt(30)+70;
		System.out.println(a);
		int size = rD.nextInt(100)+1;
		// A
		System.out.println("input acuteAngle for A");
		int acuteAngleA = sc.nextInt();
		System.out.println("input percent for A");
		int powerA = sc.nextInt();

		int AB;
		// đưa 1 góc về radian
		double radian = Math.PI * powerA / 180;
		AB = (int) Math.round(acuteAngleA / Math.cos(radian));
		System.out.println(AB);
		// B
		System.out.println("input acuteAngle for B");
		int acuteAngleB = sc.nextInt();
		System.out.println("input percent for B");
		int powerB = sc.nextInt();
		int BA;
		// đưa 1 góc về radian
		radian = Math.PI * powerB / 180;
		BA = (int) Math.round(acuteAngleB / Math.cos(radian));
		System.out.println(BA);

		showSize(AB,BA,a);
	}

}
