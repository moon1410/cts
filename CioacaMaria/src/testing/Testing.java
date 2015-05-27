package testing;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import cts.Angajati;
import cts.Casier;
import cts.Cola;
import cts.Meniu;
import cts.MeniuBuilder;
import cts.Pepsi;

@SuppressWarnings("deprecation")
public class Testing extends TestCase{

	public File file = new File("C:\\Users\\maria\\workspaceCTS\\CioacaMaria\\src\\salari.txt");
	static Angajati ang = new Angajati("Marinescu Andrei", "Vanzari", 2500);
	
	 //execute before test
	   @Before
	   public void before() {
	      String[] str1 = {"Initializare string", "Initializare string2"};
	      String[] str2 = {"Initializare string", "Initializare string2"};
	   }
	   
	@Test
	public void testUsingTemporaryFolder() throws IOException{
		assertTrue(file.createNewFile());
	}
	@Test
	public void testGetPret() {
		
		MeniuBuilder meniuBuilder = new MeniuBuilder();
		MeniuBuilder meniu = new MeniuBuilder();
		
		
		Meniu vegMeniu = meniuBuilder.preparaVegMeniu();
		Meniu normalMeniu = meniuBuilder.preparaNonVegMeniu();
		
		assertNotNull("Obiectul meniuBuilder nu este null", meniuBuilder);
		assertNotNull("Obiectul vegMeniu nu este null", vegMeniu);
		assertNotNull(normalMeniu);
		
		assertSame(meniuBuilder, meniuBuilder);
		assertNotSame(meniu, meniuBuilder);
		assertNotSame(vegMeniu, normalMeniu);
		
		assertEquals(31.0, vegMeniu.getPret(),1); //delta - the maximum delta between expected and actual for which both numbers are still considered equal.
		assertEquals(10.5, normalMeniu.getPret(), 1);
		
	
	}
	
	@Test
	public void testToString(){
		Angajati ang = new Angajati("Marinescu Andrei", "Vanzari", 2500);
		String expected = "Angajat: Marinescu Andrei, departmant: Vanzari, salariu: 2500.0";
		assertEquals(expected, ang.toString());
	}

	@Test
	public void testgetSalarii() throws IOException{
		if(file.exists()){
			BufferedReader reader = 
					new BufferedReader(new FileReader(file));
			
			String linieCurenta;
	
			while((linieCurenta = reader.readLine())!=null){
				//ignoram liniile care incep cu #
				if(linieCurenta.startsWith("#"))
					continue;
				else
				{
					System.out.println(linieCurenta);
				}
			}
		}
		else
			System.out.println("Lipsa fisier date intrare");
	}
	
	@Test 
	public void testSalariu(){
		try{
			testgetSalarii();
			ang.verifSalariu(2500);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			assertEquals(2500, 2500, 1);
			
		}
	}
	
	
	@Test
	public void testCasier(){
		Casier casier = Casier.getCasier();
		assertNotNull(casier);
	}
	
	@Test 
	public void testClasaCola(){
		Cola cola = new Cola();
		String expected = "Coca-Cola";
		assertEquals(expected, cola.nume());
		
		
	}
	
	
	
	//execute before class
	   @BeforeClass
	   public static void beforeClass() {
	      System.out.println("In metoda de before class");
	      assertNotNull(ang);
	      
	   }

	   //execute after class
	   @AfterClass
	   public static void  afterClass() {
	      System.out.println("In metoda afterClass");
	      assertNull(ang);
	   }

	  
	   //test case
	   @Test
	   public void testPepsi() {
	      System.out.println("In metoda testPepsi");
	      Pepsi pepsi = new Pepsi();
	      assertNotNull(pepsi);
	   }
		
	   //test case ignore si nu se va executa
	   @Ignore
	   public void ignoreTest() throws IOException {
	      System.out.println("in ignore test");
	      testUsingTemporaryFolder();
	   }
	   
	   //execute after test
	   @After
	   public void after() {
		   String[] str1 = {"Initializare string", "Initializare string2"};
		   String[] str2 = {"Initializare string", "Initializare string2"};
	      System.out.println("In metoda after");
	      assertArrayEquals(str1, str2);
	   }
	   public void tearDown(){
			System.out.println("Stergere obiecte");
		}
		
}
