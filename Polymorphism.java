package assignment;

//method overloading same method different parameters
class Product{
	public int add(int n1,int n2) {
		return n1+n2; 
	}
	public int add(int n1,int n2,int n3) {
		return n1+n2+n3; 
	}
	public double add(double n1,int n2) {
		return n1+n2; 
	}
	
}
public class Polymorphism {

	public static void main(String[] args) {
		Product obj=new Product();
		int r1=obj.add(3,5);
		System.out.println(r1);

	}

}
