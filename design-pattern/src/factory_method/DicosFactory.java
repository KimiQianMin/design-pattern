package factory_method;

public class DicosFactory implements IFactory {

	@Override
	public FrenchFries getFrenchFries() {
		System.out.println("Dicos FrenchFries");
		return new DicosFrenchFries();
	}

}
