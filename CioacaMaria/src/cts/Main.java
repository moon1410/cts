package cts;

import java.io.Console;
import java.util.Scanner;

import testing.Testing;
import testing.TestingCase;
import testing.TestingSuite;
import junit.framework.TestResult;
import junit.framework.TestSuite;

public class Main {

	public static void main(String[] args) {
		//-----------------Singleton------------
		Casier casier = Casier.getCasier();
		casier.numeCasier();
		casier.traseu(); // + template method 
		//----------------Singleton----------------
		
		//---------------Builder---------------------
		MeniuBuilder meniuBuilder = new MeniuBuilder();
		
		Meniu vegMeniu = meniuBuilder.preparaVegMeniu();
		System.out.println("Meniu pentru vegetarieni: ");
		vegMeniu.afisareProduse();
		System.out.println("Costul total pentru acest meniu: " + vegMeniu.getPret());

		Meniu nonVegMeniu = meniuBuilder.preparaNonVegMeniu();
		System.out.println("Meniu normal:");
		nonVegMeniu.afisareProduse();
		System.out.println("Costul total pentru acest meniu " + nonVegMeniu.getPret());
		//------------------Builder--------------------------------------------------------
		
		//-----------------Composite-------------------------------------------------------
		Angajati managerLocal = new Angajati("Stefanescu Gigel ", "Manager", 8500);
		Angajati managerMarketing = new Angajati("Ionica Mariana", "Marketing", 6000);
		Angajati salesSupervisor = new Angajati("Popescu Ion", "Vanzari", 5000);
		Angajati salesStaff1 = new Angajati("Marinescu Andreea", "Vanzari", 2000);
		Angajati salesStaff2 = new Angajati("Bogdanescu Andrei", "Vanzari", 2000);
		
		managerLocal.adauga(managerMarketing);
		managerMarketing.adauga(salesSupervisor);
		salesSupervisor.adauga(salesStaff1);
		salesSupervisor.adauga(salesStaff2);
		
		System.out.println("Structura organizatorica: ");
		System.out.println(managerLocal);
		for(Angajati manager : managerLocal.getAngajati()){
			System.out.println(manager);
			for (Angajati marketing : managerMarketing.getAngajati()){
				System.out.println(marketing);
				for(Angajati vanzari : salesSupervisor.getAngajati()){
					System.out.println(vanzari);
				}
			}
		}
	}

	//---------------------------Composite-------------------------------------

	
}
