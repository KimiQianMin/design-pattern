package factory_method;

public class McdonaldFactory implements IFactory {

	@Override
	public FrenchFries getFrenchFries() {
		System.out.println("Mcdonald FrenchFries");
		return new McdonaldFrenchFries();
	}

}
