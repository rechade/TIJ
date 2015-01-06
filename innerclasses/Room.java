// TIJ innerclasses ex18 p257
package innerclasses;
class Room {
	public static class Area {
		Area() {
			System.out.println("Area()");
		}
	}
	public static void main (String[] args) {
		Area a = new Area();
	}
}