package proxy.usingstatic;

public class SGMacSeller implements IMacSeller {

	private IMacSeller iMacSeller = new USAMacSeller();

	@Override
	public void buyMac() {
		iMacSeller.buyMac();
		System.out.println("Buy Mac from SG ... ");
	}

}
