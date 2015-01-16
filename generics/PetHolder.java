// TIJ generics p441 ex1
import net.gusto.tij.typeinfo.pets.*;

class PetHolder<T> {
	private T pet1;
	private T pet2;
	private T pet3;	
	
	public PetHolder(T pet1, T pet2, T pet3){
		this.pet1=pet1;
		this.pet2=pet2;
		this.pet3=pet3;
	}
	public void set1(T pet){this.pet1=pet;}
	public void set2(T pet){this.pet2=pet;}
	public void set3(T pet){this.pet3=pet;}
	
	public T get1(){return pet1;}
	public T get2(){return pet2;}
	public T get3(){return pet3;}
	
	public String toString() { return ""+pet1+", "+pet2+", "+pet3;}
	
	public static void main (String[] args) {		
		/*PetHolder<Pet> petHolder = new PetHolder<Pet>(new Dog());
		System.out.println(petHolder.get());
		for (int i=0; i<10; i++) {
			 petHolder.set(Pets.randomPet());
			 System.out.println(petHolder.get());
		} */
		PetHolder<Pet> petHolder = new PetHolder(Pets.randomPet(),
											Pets.randomPet(),Pets.randomPet());
		System.out.println(petHolder);
	}
}
	
		