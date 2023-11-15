package assignment;
class ProdA{
	public void show() {
		System.out.println("in prodAshow");
	}
	public void showing() {
		System.out.println("in showing");
	}
}
class ProdB extends ProdA{
	public void show() {
		System.out.println("in prodB show");
	}
	
}
public class OverRidding {

	public static void main(String[] args) {
		ProdB obj=new ProdB();
		obj.show();
		obj.showing();

	}

}
