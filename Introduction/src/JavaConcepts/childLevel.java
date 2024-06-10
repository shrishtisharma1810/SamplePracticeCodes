package JavaConcepts;

public class childLevel extends childClassDemo{
	//function overloading: multiple methods with same name
	// either no of args are different or arg type is different
	public void getData(int a) {
		System.out.println(a);
	}
	public void getData(String a) {
		System.out.println(a);
	}
	public void getData(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		childLevel c=new childLevel();
		c.getData(2);
		c.getData(10,20);
		c.getData("neha");

	}

}
