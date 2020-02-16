package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

	private Object realSubject;

	public ProxyHandler(Object realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("call the proxy handler");
		Object refObject = method.invoke(realSubject, args);
		System.out.println("proxying the class " + realSubject.getClass().getSimpleName());

		return refObject;
	}

}
