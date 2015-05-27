package cts;

public abstract class Pontaj {
	
	
	abstract void ajunge();
	abstract void pleaca();
	
	public final void traseu(){
		ajunge();
		pleaca();
	}
}
