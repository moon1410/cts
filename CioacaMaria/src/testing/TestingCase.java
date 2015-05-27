package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import cts.Angajati;

public class TestingCase extends TestCase{
	Angajati ang;
	   @Before 
	   public void setUp() {
	      System.out.println("Creare obiecte");
	      float salariu = 2500;
	     ang = new Angajati("Gigel", "Vanzari", salariu);
	      
	   }
		
	   @Test
	   public void testMarireSalariu(){
		   System.out.println("Verificam metoda de marire salariu");
		   float sal = this.ang.calculMarireSimplu();
		   assertEquals(sal,125,1);
	   }
	   
	   @Test
	    public void testListZero() {
		   List<Angajati> ang = new ArrayList<Angajati>();
		  
	        assertEquals(ang.size(), 0);
	    }

	    @Test
	    public void testList() {
	    	List<Angajati> ang = new ArrayList<Angajati>();
	    	String nume= "Gigel";
	    	String departament= "Vanzari";
	    	float salariu = 2500;
	        ang.add(new Angajati(nume, departament, salariu));
	        ang.add(new Angajati(nume, departament, salariu));
	        assertEquals(ang.size(), 2);
	    }
	    
	    @Test
	    public void testIs(){
	    	String nume= "Gigel";
	    	String departament= "Vanzari";
	    	float salariu = 2500;
	    	Angajati ang = new Angajati(nume, departament, salariu);
	    	List<Angajati> anga = new ArrayList<Angajati>();
	    	for (Angajati anga1 : anga){
	    	anga1.adauga(ang);
	    	anga1.adauga(ang);
	    	anga1.is(anga);
	    	assertEquals(anga1.is(anga), 2);
	    	}
	    	
	    }
	   @Test
	   public void testMethods() {
	      //numara testCaseurile
	      System.out.println("Numarul de TestCaseuri = "+ this.countTestCases());
			
	      //test getName 
	      String name= this.getName();
	      System.out.println("Numele TestCaseului = "+ name);

	      //test setName
	      this.setName("testNewMethods");
	      String newName= this.getName();
	      System.out.println("Numele modificat al TestCaseului = "+ newName);
	   }
	   //tearDown folosit pentru a inchide o conexiune sau pentru a curata activitatile
	   public void tearDown(  ) {
		   System.out.println("Stergere obiecte!");
	   }

}
