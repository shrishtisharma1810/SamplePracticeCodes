package JavaConcepts;

public class thisDemo {
	int a=2;
	public void getData() {
		int a=3;
		int b=a+this.a;
		System.out.println(a);
		System.out.println(this.a);//invokes value from class level i.e global variable
		System.out.println(b);
	}
	public static void main(String[] args) {
		thisDemo td=new thisDemo();
		td.getData();

	}

}
