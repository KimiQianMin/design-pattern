package proxy.usingstatic;

public class Client {

	public static void main(String[] args) {

		IMacSeller seller = new SGMacSeller();
		seller.buyMac();
	}

}
