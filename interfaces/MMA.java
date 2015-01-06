// TIJ interfaces, ex.14
package interfaces;
interface Kicker {
	void roundhouse();
	void sidekick();
}

interface Puncher {
	void backfist();
	void jab();
}

interface Blocker {
	void parry();
	void crane();
}

class Wrestler {
	void pin() {
		System.out.println("Wrestler.pin()");
	}
}

interface Fighter implements Kick, Punch, Block {
	void submit();	
}

class MixedMartialArtist extends Wrestle implements Fighter {
	public void roundhouse() {
		System.out.println("MMA.roundhouse()");
	}
	public void sidekick() {
		System.out.println("MMA.sidekick()");
	}
	public void backfist() {
		System.out.println("MMA.backfist()");
	}                                 
	public void jab() {
		System.out.println("MMA.jab()");
	}                             
	public void parry() {
		System.out.println("MMA.parry()");
	}                  
	public void crane() {
		System.out.println("MMA.crane()");
	}
}
	