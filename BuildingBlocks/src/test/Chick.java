package test;

public class Chick {
	public void flap(){
		System.out.println("Flapping");
	}
	
	private String name = "Fluffy";
	{System.out.println("setting field");}
	
	public Chick (){
		name = "Tiny";
		System.out.print("setting constructors");
	}
	
	public String getName(){
		return name;
	}
}
