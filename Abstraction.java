package assignment;

abstract class Car{
	//declaring method but not defining method 
	public abstract void drive();
	public abstract void riding();
	public void playmusic()
	{
		System.out.println("play music");
	}
}

abstract class Bmw extends Car{
	//defining a method
	public void drive(){
		System.out.println("car driving");
	}
}
class Tesla extends Bmw{     
	public void riding(){
		System.out.println("car riding");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Car obj=new Tesla();
		obj.drive();
		obj.playmusic();
	    obj.riding();
	}

}
