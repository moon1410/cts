package cts;

import java.util.ArrayList;
import java.util.List;

public class Meniu {

	private List<Produs> produse = new ArrayList<Produs>();
	


	public void addProdus(Produs produs){
		produse.add(produs);
	}
	
	public float getPret(){
		float cost = 0.0f;
		
		for(Produs prod : produse){
			cost += prod.pret();
		}
		
		return cost;
	}
	
	public void afisareProduse(){
		for(Produs prod : produse){
			System.out.println("Produs: " + prod.nume() 
					+ ", furnizor: " + prod.impachetare().ambalaj() 
					+ ", pret: " + prod.pret());
		}
	}
}