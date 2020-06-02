package OOPs;

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
		

	}

}
