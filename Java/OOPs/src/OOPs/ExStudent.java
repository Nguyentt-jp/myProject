package OOPs;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;


public class ExStudent {
	int id;
	String name;

	void insertRecord(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void displayInfo() {
		System.out.println(id + " " + name);
	}



	public static void main(String[] args) {
		ExStudent obj = new ExStudent();
		System.out.println(obj.id);
		System.out.println(obj.name);

		ExStudent obj1 = new ExStudent();
		obj.insertRecord(1, "teo");
		obj1.insertRecord(2, "tam");

		obj.displayInfo();
		obj1.displayInfo();
		ArrayList<Integer> integerArrayList = new ArrayList<>();
		integerArrayList.add(1);
		integerArrayList.add(2);

		for (Integer integer : integerArrayList) {
			System.out.println(integer);
		}
		Random ran = new Random();
		ArrayList<Integer> arraylist = new ArrayList<>();


	}
}
