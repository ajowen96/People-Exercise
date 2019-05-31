
public class People {
	String name;
	int age;
	String jobTitle;
	
	public People(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	@Override
	public String toString() {
		return "Name: " + name + "    Age: " + age + "    Job Title: " + jobTitle + "\n";
	}
}
