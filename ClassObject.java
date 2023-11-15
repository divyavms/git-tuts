package assignment;

import assignment5.A;

//creating class
class Calculator{
	public static int add(int n1,int n2)
	{
		int r=n1+n2;
		return r;
	}
}
public class ClassObject {

	public static void main(String[] args) {
		
    int num1=5;
    int num2=10;
    //creating object
   // Calculator calc=new Calculator();
    int result=Calculator.add(num1,num2);
    System.out.println(result);
    
    //Example of public getting access from outside package
    A obj=new A();
    System.out.println(obj.marks);
    obj.showing();
    
	}

}
