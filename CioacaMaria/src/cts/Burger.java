package cts;

public abstract class Burger implements Produs{
	
	public Impachetare impachetare(){
		return new Invelitoare();
	}
	
	public abstract float pret();
}
