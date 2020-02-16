package proxy.dynamic;

import java.lang.reflect.Proxy;

public class Client {

	/**
	 * JKD dynamic proxy is only applicable for interface. For class dynamic, can use CGLib & Aspectj
	 * 
	 * */
	
	public static void main(String[] args) {
		System.out.print("this is dynamic proxy main...");

		IKFC kfc = (IKFC) Proxy.newProxyInstance(Client.class.getClassLoader(), 
				new Class[] { IKFC.class },
				new ProxyHandler(new KFC()));
		kfc.eat();
		
		ImiSeller seller = (ImiSeller) Proxy.newProxyInstance(Client.class.getClassLoader(), 
				MiStoreSeller.class.getInterfaces(),
				new ProxyHandler(new MiStoreSeller()));
		seller.buy();

	}

}
