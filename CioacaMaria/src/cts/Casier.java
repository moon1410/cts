package cts;

import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

//clasa ce implementeaza conceptul de Singleton + Template
public class Casier extends Pontaj{

	private static Casier casier = new Casier();
	String nume;
	Calendar cal = Calendar.getInstance();
	float salariu;
	int vanzari;
	int ore;
	//facem constructorul static pentru ca aceasta clasa sa nu fie initializata
	private Casier(){}
	
	//Luam singurul obiect disponibil
	public static Casier getCasier(){
		return casier;
	}
	
	public void numeCasier(){
   
		Scanner in = new Scanner(System.in);
        System.out.print("Va rog introduceti numele dumneavoastra : ");
        nume = in.nextLine();       
        System.out.println("Casier : " + nume);
	}

	@Override
	void ajunge() {
		// TODO Auto-generated method stub
		cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println( "Ora la care s-a ajuns: " + sdf.format(cal.getTime()) );
	}

	@Override
	void pleaca() {
		// TODO Auto-generated method stub
		cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println( "Ora la care s-a plecat: " + sdf.format(cal.getTime()) );
	}
	
	float calculSalariu(float sal){
		
		if (vanzari == 25 && ore == 8)
		{
			sal = (10* 25)/8;
		}
		if (vanzari == 25 && ore==6){
			sal = (8 * 25)/6;
		}
		return sal;
	}
}
