package cts;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

//aceasta clasa implementeaza Composite
public class Angajati{

	private String nume;
	private String departament;
	private float salariu;
	final int plafon = 6000;
	final int procent = 5;
	private List<Angajati> subordonati;
	
	public Angajati(String nume, String departament, float salariu){
		this.nume = nume;
		this.departament = departament;
		this.salariu = salariu;
		subordonati = new ArrayList<Angajati>();
	}
	
	public void adauga(Angajati angajat){
		subordonati.add(angajat);
	}
	
	public void sterge(Angajati angajat){
		subordonati.remove(angajat);
	}
	
	public List<Angajati> getAngajati(){
		return subordonati;
	}
	
	public String toString(){
		return ("Angajat: " + nume + ", departmant: " + departament + ", salariu: " + salariu);
	}
	
	public float calculMarire(List<Angajati> ang){
		for(Angajati a : ang){
			int procent = 5;
			salariu = (salariu*procent)/100;
		}
		return salariu;
	}
	public float calculMarireSimplu(){
			salariu = (salariu*procent)/100;
			return salariu;
	}
	
	public void verifSalariu(float salariu) throws SalariuZeroException, PlafonDepasitException{
		if(salariu == 0){
			throw new SalariuZeroException("Salariul este 0 oferiti o suma");
		}
		if(salariu > 6000){
			throw new PlafonDepasitException("Salariul depaseste 6000");
		}
	}
	
	public int is(List<Angajati> ang){
		int count = 0;
		
		for(Angajati anga : ang){
			count = ang.size();
		}
		System.out.println("Numarul de abgajati este: " + count);
		return count;
	}
}
