package JavaConcepts;

public class childDemo extends parentDemo {
	String name="child name";
	public void getStringdata() {
		System.out.println(name);
		System.out.println(super.name);//this will print name from parent class as we are using super keyword
	}
	public void getData() {
		super.getData();//will invoke parent class getData
		System.out.println("i am child class");
	}
	public childDemo() {
		System.out.println("Child class constructor");
	}
	public static void main(String[] args) {
		childDemo cd=new childDemo();
		cd.getStringdata(); //This will print name from child class even if same variable exists in parent class
		//bcz it prefers local variable
		cd.getData();//will invoke child class getData
	}

}
