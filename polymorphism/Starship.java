// TIJ polymorphism, ex.16 p213
package polymorphism;
enum StateColour {CLEAR, YELLOW, RED};

class AlertState {
	protected Starship starship;
	protected StateColour state;
	
	protected void flash() {
		System.out.println(state+" "+state+" " +state);
	}
	protected void soundAlarm() {
	}
	protected void escalate(Starship s){
		System.out.println("Escalating state");
		switch (state) {
			case CLEAR : s.setState(s.yellowAlert); break;
			case YELLOW : s.setState(s.redAlert); break;
			case RED : s.setState(s.redAlert); break;
			default : s.setState(s.redAlert); break;
		}
	}
	protected void deescalate(Starship s){
		System.out.println("Deescalating state");
		switch (state) {
			case CLEAR : s.setState(s.clearAlert); break;
			case YELLOW : s.setState(s.clearAlert); break;
			case RED : s.setState(s.yellowAlert); break;
			default : s.setState(s.clearAlert); break;
		}
	}
}

class ClearAlert extends AlertState {
	ClearAlert(Starship s) {
		starship = s;
		state = StateColour.CLEAR;
	}
	protected void soundAlarm() {
		System.out.println("ALARM: <silence>");
	}	
}
class YellowAlert extends AlertState {
	YellowAlert(Starship s) {
		starship = s;
		state = StateColour.YELLOW;
	}
	protected void soundAlarm() {
		System.out.println("ALARM: beep beep beep");
	}	
}
class RedAlert extends AlertState {	
	RedAlert(Starship s) {
		starship = s;
		state = StateColour.RED;
	}
	protected void soundAlarm() {
		System.out.println("ALARM: WAAH WAAH WAAH");
	}
}
class Starship {
	AlertState clearAlert;
	AlertState redAlert;
	AlertState yellowAlert;
	
	AlertState alertState;
	
	Starship() {
		clearAlert = new ClearAlert(this);
		yellowAlert = new YellowAlert(this);
		redAlert = new RedAlert(this);
		clearAlert = new ClearAlert(this);
		alertState = clearAlert;
	}
	void setState(AlertState newAlertState) {                          
		alertState = newAlertState;			
	}	
	void checkState() {
		System.out.println("Checking state...");
		alertState.flash();
		alertState.soundAlarm();
	}
	void damage() {
		System.out.println("ship damaged!!");
		alertState.escalate(this);
	}
	void repair() {
		System.out.println("repairing ship...");
		alertState.deescalate(this);
	}
}

class StarshipTest {
	public static void main (String[] args) {
		Starship enterprise = new Starship();
		enterprise.checkState();
		enterprise.setState(enterprise.yellowAlert);		
		enterprise.checkState();		  
		enterprise.setState(enterprise.redAlert);		
		enterprise.checkState();
		enterprise.repair();		
		enterprise.checkState();		  
		enterprise.repair();		
		enterprise.checkState();		  
		enterprise.damage();		
		enterprise.checkState();		  
		enterprise.damage();		
		enterprise.checkState();		  
		enterprise.damage();		
		enterprise.checkState();		  
	}
}