// TIJ innerclasses ex9 + 10 p250
package innerclasses;
interface Keyboard {
	Keyboard getReference();
}

class MidiControllers {
	
	Keyboard findInstrument () {
		if (true) {
			class Qunexus implements Keyboard {
				public Keyboard getReference() {
					return this;
				}
				
			}		
			Qunexus q = new Qunexus();
			return q.getReference();
		} else {
			return (Keyboard)null;
		}
		
	}
	public static void main (String[] args) {
		MidiControllers mc1 = new MidiControllers();
		System.out.println(mc1.findInstrument());
	}
}
	