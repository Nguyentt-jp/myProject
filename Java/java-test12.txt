package OOPs;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	static ArrayList<String> getName(){
		ArrayList<String> nameArr = new ArrayList<>();
		Scanner sC = new Scanner(System.in);
		int i=0;
		while(true) {
			System.out.println("名前は");
			String name=sC.nextLine();
			if(name.equals("end")) {
				break;
			}
			nameArr.add(name);
			i++;
		}
		return nameArr;
	}
	
	static ArrayList<Integer> getAge(ArrayList<String> names){
		ArrayList<Integer> ageArr = new ArrayList<>();
		Scanner sC = new Scanner(System.in);
		int i=0;
		while(i<names.size()) {
			System.out.println("年齢は");
			ageArr.add(sC.nextInt());
			i++;
		}
		return ageArr;
	}
	
	static ArrayList<String> getCountries(ArrayList<String> names){
		ArrayList<String> countriesArr = new ArrayList<>();
		Scanner sC = new Scanner(System.in);
		int i=0;
		while(i<names.size()) {
			System.out.println("国籍は");
			countriesArr.add(sC.nextLine());
			i++;
		}
		return countriesArr;
	}
	
	static void showInfo(ArrayList<String> names, ArrayList<String> countries, ArrayList<Integer> ages) {
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i)+"さんは"
								+ages.get(i)+"才です。"+"国籍は"
									+countries.get(i)+"です。");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> nameStringArr = getName();
		ArrayList<Integer> ageIntArr = getAge(nameStringArr);
		ArrayList<String> countriesStrArr = getCountries(nameStringArr);
		
		showInfo(nameStringArr, countriesStrArr, ageIntArr);
	}

}
