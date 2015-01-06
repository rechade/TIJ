// TIJ initialisation, ex 21 + 22
// enums p143
package initialisation;

enum NoteValue {
	FIVE, TEN, TWENTY, FIFTY 
}

class Note {
	NoteValue value;
	
	public Note (NoteValue n) {
		value = n;	
	}
	
	public void Describe() {
		switch (value) {
			case FIVE: 	System.out.println("Five pounds");
					break;
			case TEN: 	System.out.println("Ten pounds");
					break;
			case TWENTY: 	System.out.println("Twenty pounds");
					break;
			case FIFTY: 	System.out.println("Fifty pounds");
					break;
		}
	}
}

public class PaperCurrency {
	public static void main (String[] args) {
		for (NoteValue v: NoteValue.values()){
			System.out.print(v + " " + v.ordinal());
			System.out.println();
		}
		Note n0 = new Note(NoteValue.FIVE);
		n0.Describe();
		Note n1 = new Note(NoteValue.TEN);
		n1.Describe();
		Note n2 = new Note(NoteValue.TWENTY);
		n2.Describe();
		Note n3 = new Note(NoteValue.FIFTY);
		n3.Describe();
	}
}