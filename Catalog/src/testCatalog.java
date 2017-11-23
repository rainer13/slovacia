import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Elev.Elev;
import catalog.Catalog;
import catalog.ElevXMaterie;
import junit.framework.TestCase;
import materie.Biologie;
import materie.Matematica;
import materie.Romana;

public class testCatalog{
	Catalog c;
	Elev e, e2, e3;
	
	
	
	/*
	
	@BeforeClass
	public static void setUpClass() throws Exception {
		 e= new Elev("a", "a", "a");
		 e2= new Elev("b", "b", "b");
		 e3= new Elev("c", "c", "c");
		ElevXMaterie a= new ElevXMaterie(new Biologie(), e);
		c= new Catalog();
		c.addElevMaterieNota(e, new Biologie(), 7);
		c.addElevMaterieNota(e, "Biologie", 10);
		
		c.addElevMaterieNota(e, new Matematica(), 7);
		c.addElevMaterieNota(e, "Matematica",6);
		
		
		c.addElevMaterieNota(e, new Romana(), 10);
		c.addElevMaterieNota(e, "Romana",10);
		
		
		
		
		c.addElevMaterieNota(e2, new Biologie(), 7);
		c.addElevMaterieNota(e2, "Biologie", 5);
		
		c.addElevMaterieNota(e2, new Matematica(), 8);
		c.addElevMaterieNota(e2, "Matematica",4);
		
		
		c.addElevMaterieNota(e2, new Romana(), 9);
		c.addElevMaterieNota(e2, "Romana",8);
	}*/
	
	@Before
	public void setUp() throws Exception{
		e= new Elev("a", "a", "a");
		 e2= new Elev("b", "b", "b");
		 e3= new Elev("c", "c", "c");
		ElevXMaterie a= new ElevXMaterie(new Biologie(), e);
		c= new Catalog();
		c.addElevMaterieNota(e, new Biologie(), 7);
		c.addElevMaterieNota(e, "Biologie", 10);
		
		c.addElevMaterieNota(e, new Matematica(), 7);
		c.addElevMaterieNota(e, "Matematica",6);
		
		
		c.addElevMaterieNota(e, new Romana(), 10);
		c.addElevMaterieNota(e, "Romana",10);
		
		
		
		
		c.addElevMaterieNota(e2, new Biologie(), 7);
		c.addElevMaterieNota(e2, "Biologie", 5);
		
		c.addElevMaterieNota(e2, new Matematica(), 8);
		c.addElevMaterieNota(e2, "Matematica",4);
		
		
		c.addElevMaterieNota(e2, new Romana(), 9);
		c.addElevMaterieNota(e2, "Romana",8);
	}
	
	@Test
	public  void test1() {
		int expected=8, actual;
		actual=c.getMediaGeneralaAUnuiElev(e);
		System.out.println(actual+" "+expected);
		assertEquals(expected, actual);
	}


	@Test
	public  void test3() {
		int expected=7, actual;
		actual=c.getMediaClasei();
		assertEquals(expected, actual);
	}
	
	@Test
	public  void test2() {
		int expected=7, actual=0;
		System.out.println(actual+" "+expected);
		actual=c.getMediaClasei();
		assertEquals(expected, actual);
	}

}
