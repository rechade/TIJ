// TIJ innerclasses ex14 p254 
// based on interfaces/HorrorShow.java
package innerclasses;

interface Monster {
  void menace();
}

interface DangerousMonster extends Monster {
  void destroy();
}

interface Lethal {
  void kill();
}

class DragonZilla implements DangerousMonster {
  public void menace() {}
  public void destroy() {}
}	

interface Vampire extends DangerousMonster, Lethal {
  void drinkBlood();
}

class VeryBadVampire implements Vampire {
  public void menace() {}
  public void destroy() {}
  public void kill() {}
  public void drinkBlood() {}
}	

public class HorrorShow {
	Vampire vampire() {
		return new Vampire() {
			public void menace() {}
			public void destroy() {}
			public void kill() {}
			public void drinkBlood() { System.out.println("Vampire.drinkBlood() glug");}
		};
	}
	DangerousMonster dangerousMonster() {
		return new DangerousMonster() {
			public void menace() {}
			public void destroy() {}			
		};
	}
	
  static void u(Monster b) { b.menace(); }
  static void v(DangerousMonster d) {
    d.menace();
    d.destroy();
  }
  static void w(Lethal l) { l.kill(); }
  public static void main(String[] args) {
    DangerousMonster barney = new DragonZilla();
    u(barney);
    v(barney);
    Vampire vlad = new VeryBadVampire();
    u(vlad);
    v(vlad);
    w(vlad);
  }
} ///:~
