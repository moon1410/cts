package cts;

public abstract class BauturaRece implements Produs{
	
	public Impachetare impachetare(){
		return new Sticla();
	}
	
	public abstract float pret();
}
