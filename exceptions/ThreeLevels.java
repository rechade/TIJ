// TIJ exceptions ex25 p345
package exceptions;
class YellowAlert extends Exception {
}
class OrangeAlert extends YellowAlert {
}
class RedAlert extends OrangeAlert {
}

class A {
	void proximity() throws YellowAlert{
		throw new YellowAlert();
	}
}

class B extends A {
	void proximity() throws OrangeAlert {
		throw new OrangeAlert();
	}
}

class C extends B {
	void proximity() throws RedAlert {
		throw new RedAlert();
	}
}
class ThreeLevels {
	static void scanNeutralZone(A a) {
		try {
			a.proximity();
		} catch (YellowAlert y) {
			System.out.println(y);
			y.printStackTrace();
		} 
	}
	public static void main (String[] args) {		
		C c=new C();		
		try{
			c.proximity();
			//((A)c).proximity();
			//scanNeutralZone(c);	
		} catch (YellowAlert y) {
			System.out.println(y);
			y.printStackTrace();
		}
	}
}