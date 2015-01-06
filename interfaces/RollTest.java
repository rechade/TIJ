// TIJ interfaces, ex.13 p231
package interfaces;
interface CanRoll {
	public void roll();	
}
interface CanCoast extends CanRoll {
	public void coast();	
}
interface CanRollBack extends CanRoll {	
	public void rollBack();	
}
interface CanWheel extends CanCoast, CanRollBack {
	
}