
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		People p1 = new People("Dave", 40, "Chief Banter");
		People p2 = new People("Geoffrey", 21, "Mad Lad");
		People p3 = new People("Big Al", 25, "Brexiteer");
		People p4 = new People("Bobby", 33, "Streamer");
		People p5 = new People("Phil", 47, "Builder");
		ArrayList<People> listPeople = new ArrayList<>();
		listPeople.add(p1);
		listPeople.add(p2);
		listPeople.add(p3);
		listPeople.add(p4);
		listPeople.add(p5);
		String name = "Bobby";
		boolean Found = false;
		for (int i=0; i< listPeople.size(); i++) {
			if (listPeople.get(i).name == name) {
				Found = true;
				System.out.println(listPeople.get(i).name + " is here.");
				break;
			}
			else {
				Found = false;
			}
		}
		if (Found == true) {
			System.out.println(name + " has been found.");
		}
		else {
			System.out.println(name + " has not been found.");
		}
		System.out.println(listPeople);
	}
}
