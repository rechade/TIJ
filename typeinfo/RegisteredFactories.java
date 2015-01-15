// TIJ typeinfo p429
// add Null Objects to the code
//: net.gusto.tij.typeinfo/RegisteredFactories.java
// Registering Class Factories in the base class.
package net.gusto.tij.typeinfo;
import net.gusto.tij.typeinfo.factory.*;
import java.lang.reflect.*;
import java.util.*;
import net.mindview.util.Null;

class PartProxyHandler implements InvocationHandler {
	private Object proxied;
	PartProxyHandler(Object nameable) {
		this.proxied = new NullVersion(nameable.getClass().getSimpleName());
	}
	private class NullVersion implements Null, Nameable {
		private String nullName;
		NullVersion(String name) {
			nullName = name;
		}			
		public String toString() {
			return nullName;
		}
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(proxied,args);
	}
}
interface Nameable {
	public String toString();
}
class Part implements Nameable {
	public String toString() {
		return getClass().getSimpleName();
	}
	static List<Factory<? extends Part>> partFactories =
		new ArrayList<Factory<? extends Part>>();	
	static {
		// Collections.addAll() gives an "unchecked generic
		// array creation ... for varargs parameter" warning.
		partFactories.add(new FuelFilter.Factory());
		partFactories.add(new AirFilter.Factory());
		partFactories.add(new CabinAirFilter.Factory());
		partFactories.add(new OilFilter.Factory());
		partFactories.add(new FanBelt.Factory());
		partFactories.add(new PowerSteeringBelt.Factory());
		partFactories.add(new GeneratorBelt.Factory());
	}
	private static Random rand = new Random(47);
	public static Nameable createRandom() {
		Part part = null;
		int n = rand.nextInt(partFactories.size());
		part = partFactories.get(n).create();
		if (n%2==0) {
			return part;
		} else {
			return (Nameable)Proxy.newProxyInstance(Nameable.class.getClassLoader(), 
													new Class[]{Nameable.class},
													new PartProxyHandler(part) );
		}
	}
}	

class Filter extends Part {}

class FuelFilter extends Filter {
	// Create a Class Factory for each specific type:
	public static class Factory
	implements net.gusto.tij.typeinfo.factory.Factory<FuelFilter> {
		public FuelFilter create() { return new FuelFilter(); }
	}
}

class AirFilter extends Filter {
	public static class Factory
	implements net.gusto.tij.typeinfo.factory.Factory<AirFilter> {
		public AirFilter create() { return new AirFilter(); }
	}
}	

class CabinAirFilter extends Filter {
	public static class Factory
	implements net.gusto.tij.typeinfo.factory.Factory<CabinAirFilter> {
		public CabinAirFilter create() {
			return new CabinAirFilter();
		}
	}
}

class OilFilter extends Filter {
	public static class Factory
	implements net.gusto.tij.typeinfo.factory.Factory<OilFilter> {
		public OilFilter create() { return new OilFilter(); }
	}
}	

class Belt extends Part {}

class FanBelt extends Belt {
	public static class Factory
	implements net.gusto.tij.typeinfo.factory.Factory<FanBelt> {
		public FanBelt create() { return new FanBelt(); }
	}
}

class GeneratorBelt extends Belt {
	public static class Factory
	implements net.gusto.tij.typeinfo.factory.Factory<GeneratorBelt> {
		public GeneratorBelt create() {
			return new GeneratorBelt();
		}
	}
}	

class PowerSteeringBelt extends Belt {
	public static class Factory
	implements net.gusto.tij.typeinfo.factory.Factory<PowerSteeringBelt> {
		public PowerSteeringBelt create() {
			return new PowerSteeringBelt();
		}
	}
}	

public class RegisteredFactories {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			try {
				System.out.println(Part.createRandom());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
} /* Output:
GeneratorBelt
CabinAirFilter
GeneratorBelt
AirFilter
PowerSteeringBelt
CabinAirFilter
FuelFilter
PowerSteeringBelt
PowerSteeringBelt
FuelFilter
*///:~
