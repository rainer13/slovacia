package main;
import materie.*;

import java.util.HashMap;

import Elev.Elev;
import catalog.Catalog;
import catalog.ElevXMaterie;

public class Main {
	

	public static void main(String[] args) {
		
		
		Elev e= new Elev("a", "a", "a");
		Elev e2= new Elev("b", "b", "b");
		Elev e3= new Elev("c", "c", "c");
		ElevXMaterie a= new ElevXMaterie(new Biologie(), e);
		Catalog c= new Catalog();
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
	
		
		for(ElevXMaterie em: c.note.keySet()) 
			System.out.println(em.toString()+" "+c.note.get(em));
				
			
		
		
		System.out.println(c.mediaUnuiElevLaOMaterie(e, "Biologie"));
		
		System.out.println(c.getMediaGeneralaAUnuiElev(e));
		System.out.println(c.getMediaGeneralaAUnuiElev(e2));
		
		System.out.println(c.getMediaClasei());
		
			
	}
	
	
	
	
	

}
