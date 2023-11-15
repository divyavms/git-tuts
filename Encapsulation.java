package assignment;

class Employee{
	private int age;
	private String name="divya";
	
	//creating method to get access private variables
	public int getAge(){
		return age;
	}
	public void setAge(int a) {
		age=a;
	}
	public String getName() {
		return name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
	
 Employee obj=new Employee();
 obj.setAge(20);
 System.out.println(obj.getName()+":"+obj.getAge());
	}

}
