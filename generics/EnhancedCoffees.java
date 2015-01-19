package net.gusto.tij.generics;
class BasicCoffee {
	public void taste() {
		System.out.println("Black coffee");
	}
	public double getCost(){
		return 0.50;
	}
}
abstract class CoffeeDecorator extends BasicCoffee {
	protected BasicCoffee basic;
	CoffeeDecorator(BasicCoffee basic){
		this.basic=basic;
	}
	abstract public void taste();
	abstract public double getCost();		
}
class SteamedMilk extends CoffeeDecorator {	
	SteamedMilk(BasicCoffee basic){
		super(basic);
		this.basic=basic;
	}
	public void taste(){
		basic.taste();
		System.out.println("Steamed Milk");
	}
	public double getCost() {
		return 0.20 + basic.getCost();
	}
}
class Foam extends CoffeeDecorator {	
	Foam(BasicCoffee basic){
		super(basic);
		this.basic=basic;
	}
	public void taste(){
		basic.taste();
		System.out.println("Foamy");
	}
	public double getCost() {
		return 0.18 + basic.getCost();
	}
}
class Chocolate extends CoffeeDecorator {	
	Chocolate(BasicCoffee basic){
		super(basic);
		this.basic=basic;
	}
	public void taste(){
		basic.taste();
		System.out.println("Chocolate");
	}
	public double getCost() {
		return 0.25 + basic.getCost();
	}
}
class Caramel extends CoffeeDecorator {	
	Caramel(BasicCoffee basic){
		super(basic);
		this.basic=basic;
	}
	public void taste(){
		basic.taste();
		System.out.println("Caramel");
	}
	public double getCost() {
		return 0.22 + basic.getCost();
	}
}
class WhippedCream extends CoffeeDecorator {	
	WhippedCream(BasicCoffee basic){
		super(basic);
		this.basic=basic;
	}
	public void taste(){
		basic.taste();
		System.out.println("Whipped Cream");
	}
	public double getCost() {
		return 0.32 + basic.getCost();
	}
}
class EnhancedCoffees {
	public static void main (String[] args) {
		BasicCoffee bc = new BasicCoffee();
		bc.taste();
		System.out.println(bc.getCost()+" GBP");
		BasicCoffee theLot = new WhippedCream(new Caramel(new Chocolate(new Foam(new SteamedMilk(new BasicCoffee())))));
		theLot.taste();
		System.out.println(theLot.getCost()+" GBP");
	}
}
