// TIJ innerclasses ex6 p249
package innerclasses2;
import innerclasses.Tablet;
import innerclasses.controller.TiltControl;

class MicrosoftSurface extends Tablet {	
	// have to inherit from the protected innerclass Tablet.Sensor
	// to make a new Sensor type.		
	class MicrosoftSensor extends Sensor {
	}
	TiltControl getSensor() {
		// a MicrosoftSurface tablet can't use the protected inner Sensor class
		// directly (why? protected means package or derived usage. MicrosoftSurface
		// is derived from Tablet, not Sensor.) Inherit a Microsoft version to be able
		// to use it.
		return (Tablet.Sensor)(new MicrosoftSensor());
		// below would work with an explicit public Sensor() constructor
		// in Tablet, otherwise you get a "Tablet.Sensor() is protected" error
		//! return new Sensor();
	}
	public static void main (String[] args) {
		MicrosoftSurface ms1 = new MicrosoftSurface();
		// You can use a Tablet.Sensor: s1 which has been made inside Tablet in the
		// same package but you can't make a Tablet.Sensor here
		ms1.s1.tilt(46);		
		// make a new Sensor
		System.out.println(ms1.getSensor());		
	}
}