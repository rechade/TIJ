// TIJ innerclasses ex19 p257
package innerclasses;
class City {	
	static class Street {		
		static class Building {
			int i = 20;
			public static void main (String[] args) {
				System.out.println("City.Street.Building.main()!");
			}
		}
	}
	public static void main (String[] args) {
		//! System.out.println(Street.Building.i);
		Street s = new Street();
		Street.Building b1 = new Street.Building();
		Street.Building b2 = new Street.Building();
		System.out.println(b1.i);                     
		System.out.println(b2.i);
	}
}