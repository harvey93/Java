import test.Chick;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Animal("Lucas");
		Chick flappy = new Chick();
//		dog.setName("Fredo");
		System.out.println(dog.getName());
		flappy.flap();
		System.out.println(flappy.getName());
	}

}
