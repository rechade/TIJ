// TIJ interfaces, ex. 14 + 15 p232
// you can only inherit from one class per class definition p230
// Wrestler is one class, TaiChi another. You can use multiple interfaces in the
// same statement, but to combine TaiChi into the inheritance it needs to go 
// into another generation level here
package interfaces;
abstract class TaiChi extends Wrestler {
	abstract void peng();
	void pin() {
		System.out.println("TaiChi.pin()");
		super.pin();
	}
}
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
interface ValeTudo extends Kicker, Puncher, Blocker {
	void submit();
}
class MixedMartialArtist extends TaiChi implements ValeTudo {
	public void roundhouse() {
		System.out.println("MixedMartialArtist.roundhouse()");
	}
	public void sidekick() {
		System.out.println("MixedMartialArtist.sidekick()");
	}
	public void backfist() {
		System.out.println("MixedMartialArtist.backfist()");
	}                                 
	public void jab() {
		System.out.println("MixedMartialArtist.jab()");
	}                             
	public void parry() {
		System.out.println("MixedMartialArtist.parry()");
	}                  
	public void crane() {
		System.out.println("MixedMartialArtist.crane()");
	}
	public void submit() {
		System.out.println("MixedMartialArtist.submit()");
	}
	public void peng() {
		System.out.println("MixedMartialArtist.peng()");
	}
	public void kick(Kicker k) {
		k.roundhouse();
		k.sidekick();
	}
	public void punch(Puncher p) {
		p.backfist();
		p.jab();
	}
	public void block(Blocker b) {
		b.crane();
		b.parry();
	}
	public void nhb(ValeTudo v) {
		v.submit();
	}
	public void chiPower(TaiChi t) {
		t.peng();
		t.pin();
	}
	public static void main (String[] args) {
		MixedMartialArtist m = new MixedMartialArtist();
		m.kick(m);
		m.punch(m);
		m.block(m);
		m.nhb(m);
		m.chiPower(m);
	}
}