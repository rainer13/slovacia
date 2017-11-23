package catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;

import materie.Biologie;
import materie.Materie;
import Elev.Elev;


public class Catalog {

	public ArrayList<Materie> m = new ArrayList<Materie>();
	public ArrayList<Elev> e = new ArrayList<Elev>();
	public HashMap<ElevXMaterie, ArrayList<Integer>> note = new HashMap<ElevXMaterie, ArrayList<Integer>>();
	
	public void addMaterie(Materie materie) {

		this.m.add(materie);

	}

	public void addElev(Elev elev) {

		this.e.add(elev);

	}

	
	

	public void addElevMaterieNota(Elev e, Materie m, int nota) {
		ElevXMaterie em=new ElevXMaterie(m, e);
		if(note.containsKey(em))
		{
			ArrayList<Integer> l = note.get(em);
			l.add(nota);
			note.put(em, l);
			
		}
		else {
			ArrayList<Integer> ali=new ArrayList<Integer>();
			ali.add(nota);
			note.put(em, ali);
		}
			
		
		
		
		
	}
	
	/*public Catalog() {
		HashMap<String, String> nm=new HashMap<String, String>({"A":"a","B":"b"}); 
	}*/

	public void addElevMaterieNota(Elev e, String materie, int nota) {
		try {
			Materie m=((Materie)(Class.forName("materie."+materie).newInstance()));
			ElevXMaterie em=new ElevXMaterie(m, e);
			if(note.containsKey(em))
			{
				ArrayList<Integer> l = note.get(em);
				l.add(nota);
				note.put(em, l);
			}

			else {
				ArrayList<Integer> ali=new ArrayList<Integer>();
				ali.add(nota);
				note.put(em, ali);
			}
			
			
			
			
		}
		catch(Exception ee) {
			ee.printStackTrace();
		}
		
	 }
	
	
	
		public int mediaUnuiElevLaOMaterie(Elev e, String materie) {
			
			int s=0;
			
			for(ElevXMaterie em:this.note.keySet())
				if(em.e.equals(e)&&em.m.getClass().toString().endsWith(materie))
					s=em.m.getMedie(note.get(em));
			
			if(s==0) 
				return 0;
			else
				return s;
			
			
			
			
			
		}
		
		
		
		 public int getMediaClasei() {
			 
			HashMap<Elev, Integer> elevMedie= new HashMap<Elev, Integer>();
			int s=0;
			
			for(ElevXMaterie em:this.note.keySet())
				if(!elevMedie.containsKey(em.e))
					elevMedie.put(em.e, getMediaGeneralaAUnuiElev(em.e));
			
			for(Integer i :elevMedie.values()) {
				
				s+=i;
				
			}
			
			
			return s/elevMedie.size();
	}
		 
		 public int getMediaClasei1() {
			 
				HashSet<Elev> elevi=new HashSet<>();
				int s=0;
				
				for(ElevXMaterie em:this.note.keySet())
					if(!elevi.contains(em.e)) {
						elevi.add(em.e);
						s+=getMediaGeneralaAUnuiElev(em.e);
					}
				
				
				return s/elevi.size();
		}


		 
		 
		 
		 
		public int getMediaGeneralaAUnuiElev(Elev e) {
			
			
		int count=0;
		int s=0;
		ArrayList<Integer> mediaLaOMaterie=new ArrayList<Integer>();
		
		
		for(ElevXMaterie e3:note.keySet())
			if(e3.e==e)
					mediaLaOMaterie.add(e3.m.getMedie(this.note.get(e3)));
					
			
		for(Integer i:mediaLaOMaterie) {
			 
			 count++;
			 s=s+i;
			
		 }
		
		 double f=1.0*s/count;
		 Double d=new Double(f);
		 return d.intValue();
			
			
			
		}
	
	
	

}
