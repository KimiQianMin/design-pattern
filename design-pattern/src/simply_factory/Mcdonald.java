package simply_factory;

public class Mcdonald {

	public IFood getFood(String name) {

		switch (name) {

		case "FrenchFries":
			return new FrenchFries();

		case "McChicken":
			return new McChicken();

		default:
			System.out.println("We dun provide this kind of food ... ");
			return null;
		}
	}
}
