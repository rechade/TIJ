import java.util.Arrays;
class John {
	int i;
	John(int integer) {
		i = integer;
	}
	John() {
		//this(3);
		try {
			John j2 = new John();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	void printArray(int... args) {
		for (Object o : args) {
			System.out.println(o);
		}
	}
	public static void main (String[] args) {
		John j = new John();	
		Integer[] a1 = { 1, 2, 3, 4, 5 };		
		//j.printArray(Object[].class.cast(a1));
		j.printArray(new Integer(22), 88);
	}
}                          