// TIJ strings ex6, p369
class FormatMembers {
	int i = 900;
	long l = 33000L;
	float f = 23.4666F;
	double d = 9876.333;
	
	public String toString() {
		return String.format("%7d %7d %8.2f %8.2f",i,l,f,d);
	}
	
	public static void main (String[] args) {
		FormatMembers fm = new FormatMembers();
		System.out.println(fm);
	}
}