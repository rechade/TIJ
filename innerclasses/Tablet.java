// TIJ innerclasses ex6 p249
package innerclasses;
import innerclasses.controller.TiltControl;

public class Tablet {
	protected Sensor s1 = new Sensor();
	protected class Sensor implements TiltControl {
		// public Sensor() {}
		public void tilt(int degrees) {
			System.out.println("tilting " + degrees + " degrees");
		}
	}	
}