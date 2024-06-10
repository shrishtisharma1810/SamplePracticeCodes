package JavaConcepts;

public class StaticVar {
	String name;//Instance variable: its value changes on every instance i.e obj
	String address;//Instance variable: its value changes on every instance i.e obj
	static String city="Nashik";//class variable: its value is fixed at class level 
	                           //and is common to all objects/instances
	
	//StaticVar(String name, String address, String city){
	StaticVar(String name, String address){
		this.name=name;//Local variable
		this.address=address;
		//this.city=city;
	}
	public void getAddress() {
		System.out.println(address+" "+city);
	}
	public static void main(String[] args) {
		//StaticVar sv=new StaticVar("Bob","Balram nagar","Nashik");
		//StaticVar sv1=new StaticVar("Neha","Saraswati nagar","Nashik");
		StaticVar sv=new StaticVar("Bob","Balram nagar");
		StaticVar sv1=new StaticVar("Neha","Saraswati nagar");
		sv.getAddress();
		sv1.getAddress();
		//but we cannot go on creating instances for every client
		//Also all clients if they belong to same city no point in wasting memory on every instance
	}

}
