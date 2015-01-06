// TIJ innerclasses ex11 p251
package innerclasses;
public interface Scratch {
	void scratch();
}

class John {
	public Scratch getScratch() {
		return new BadHabit();
	}
	private class BadHabit implements Scratch {
		public void scratch() {
			System.out.println("cccrr-ccrr-cccrr");
		}		
		public void what() {
			System.out.println("BadHabit"); 
		}
	}	
}

class Mary {
	public static void main (String[] args) {
		John j = new John();		
		j.getScratch().scratch();		
		Object o = j.getScratch();
		((Scratch)o).scratch();
		//! ((BadHabit)o).what();				
	}
}