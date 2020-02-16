package adapter.classadapter;

public class PowerAdapter extends Power220V implements Power5V {

	@Override
	public void getPower5V() {
		super.getPower220V();
		convert();
		System.out.println("output 5V ... ");
	}

	private void convert() {
		System.out.println("convert 220V to 5V ... ");
	}
}
