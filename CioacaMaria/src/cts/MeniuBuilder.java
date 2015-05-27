package cts;

public class MeniuBuilder {
	public Meniu preparaVegMeniu(){
		Meniu meniu = new Meniu();
		meniu.addProdus(new VegBurger());
		meniu.addProdus(new Cola());
		return meniu;
	}
	
	public Meniu preparaNonVegMeniu(){
		Meniu meniu = new Meniu();
		meniu.addProdus(new Cheesburger());
		meniu.addProdus(new Pepsi());
		return meniu;
	}
}
