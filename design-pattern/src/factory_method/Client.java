package factory_method;

public class Client {

	public static void main(String[] args) {

		System.out.println("This is factory method ...");

		IFactory factory = new DicosFactory();
		factory.getFrenchFries().eat();

	}

}
