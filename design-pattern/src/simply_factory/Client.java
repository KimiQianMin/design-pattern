package simply_factory;

public class Client {

	public static void main(String[] args) {

		System.out.println("This is simply factory ...");

		Mcdonald mcdonald = new Mcdonald();

		IFood food = mcdonald.getFood("FrenchFries");
		if (food != null) {
			food.eat();
		}

		food = mcdonald.getFood("McChicken");
		if (food != null) {
			food.eat();
		}

		food = mcdonald.getFood("ChickenRice");
		if (food != null) {
			food.eat();
		}

	}

}
