interface Interface {
	void doSomething();
	void somethingElse(String arg);
}
class RealObject implements Interface {
	public void doSomething(){
		System.out.println("doSomething");
	}
	public void somethingElse(String arg){
		System.out.println("somethingElse " +arg);
	}	
}
class SimpleProxy implements Interface {
	private Interface proxied;
	SimpleProxy(Interface proxied) {
		this.proxied = proxied;
	}
	public void doSomething(){
		System.out.println("You called the proxy which does this followed by the real object:");		
		long startTime = System.nanoTime();
		proxied.doSomething();
		long endTime = System.nanoTime();
		System.out.println("Start nanotime = "+startTime);		
		System.out.println("End nanotime = "+endTime);
		System.out.println("in nanotime proxied.doSomething took: "+(endTime-startTime));
	}
	public void somethingElse(String arg){
		System.out.println("You called the proxy which does this followed by the real object:");
		proxied.somethingElse(arg);		
	}	
}

class UseProxy {
	static void doActivities(Interface i){
		i.doSomething();
		i.somethingElse("Video games");
	}
	
	public static void main (String[] args) {
		doActivities(new SimpleProxy(new RealObject()));
	}		
}