package JavaConcepts;

public class childClassDemo extends parentClassDemo{
	//function overriding: parent and child class have method with same name, signature and arg, 
	//priority is given to local method first
	public void audio() {
		System.out.println("audio system");
	}
	public void engine() {
		System.out.println("engine");
	}
	public void colour() {
		System.out.println("color");
	}
	public void brakes() {
		System.out.println("child brakes");
	}
	public static void main(String []args) {
		childClassDemo c=new childClassDemo();
		c.colour();
		c.brakes();
		c.audio();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
