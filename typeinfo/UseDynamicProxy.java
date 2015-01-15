import java.lang.reflect.*;

class DynamicProxyHandler implements InvocationHandler {
	private Object proxied;
	public DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// another recursion triggered by toString(), but any call to proxy() is
		// directed through this invoke() when using an Invocation handler
		//! System.out.println(proxy);
		System.out.println("**** proxy: "+proxy.getClass() + ", method: " 
			+ method + "args: " + args);
		if(args != null) {
			for (Object arg : args) {
				System.out.println(" "+arg);
			}
		}		
			
		long startTime = System.nanoTime();
		Object result = method.invoke(proxied,args);	
		long endTime = System.nanoTime();
		System.out.println("Start nanotime = "+startTime);		
		System.out.println("End nanotime = "+endTime);
		System.out.println("in nanotime proxied.doSomething took: "+(endTime-startTime));
		return result;
	}
}
class UseDynamicProxy {
	public static void doActivities(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	public static void main (String[] args) {
		RealObject real = new RealObject();
		doActivities(real);
		// Insert a proxy and call again
		Interface proxy = (Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(),
															new Class[] {Interface.class},
															new DynamicProxyHandler(real));
		doActivities(proxy);
	}
}