package adapter.objectadapter;

public class PowerAdapter implements Power5V {

	private Power220V power220V;

	public PowerAdapter(Power220V power220V) {
		this.power220V = power220V;
	}

	@Override
	public void getPower5V() {
		power220V.getPower220V();
		convert();
		System.out.println("output 5V ... ");
	}

	private void convert() {
		System.out.println("convert 220V to 5V ... ");
	}
}
