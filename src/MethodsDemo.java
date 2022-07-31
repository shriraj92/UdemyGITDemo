
public class MethodsDemo {

	public static void main(String[] args) {
		
		// if a non static method from same class need to be called...first object of that class has to created and then call those methods.
		
		MethodsDemo d = new MethodsDemo();
		d.getData();
		String name = d.getData1();
		System.out.println(name);
		
	
		// static methods from the same class can be called without creating an object.Can be called just by method name
		getData2();
		
		// static methods from the diff class can be called without creating an object.Can be called by class.method name
		MethodsDemo2.getData4();
		
		// static methods from the diff class can be called by creating an object also
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getData4();
		
		// if a non static method from diff class need to be called...first object of that class has to created and then call those methods.
		d1.getData3();
		
	}
	
	//why method???----------->whenever there is an need of a piece of code that has to be reused everytime then the codes are written inside a method and called during execution.
	// Always Method has to written outside of main method...Java wont allow it inside main method
	
	//Method without any return type
	
	public void getData()
	{
		System.out.println("Method to get data");
	}
	
	//Method with String return type
	
	public String getData1()
	{
		System.out.println("Hello World");
		return "Rahul Shetty Academy";
	}
	
	//static Method without any return type
	
	public static void getData2()
	{
		System.out.println("Static Method to get data");
	}

}
