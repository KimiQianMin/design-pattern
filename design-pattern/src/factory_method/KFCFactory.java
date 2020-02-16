package factory_method;

public class KFCFactory implements IFactory {

	@Override
	public FrenchFries getFrenchFries() {
		System.out.println("KFC FrenchFries");
		return new KFCFrenchFries();
	}

}
