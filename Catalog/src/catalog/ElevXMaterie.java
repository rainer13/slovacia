package catalog;
import materie.Materie;
import Elev.Elev;


public class ElevXMaterie {

	public Elev e;
	public Materie m;
	
	public ElevXMaterie(Materie m, Elev e) {
		
		this.e=e;
		this.m=m;
		
	}
	
	
	public boolean equals(Object o) {
		if(!(o instanceof ElevXMaterie))
			return false;
		ElevXMaterie x=(ElevXMaterie)o;
		if(m.getClass()!=x.m.getClass())
			return false;
		return e.equals(x.e);
			
			
	}
	
	
	public int hashCode() {
		
		
		
		return e.hashCode();
		
		
	}
	
	
	public String toString() {
		
		
		return e.numarMatricol+" "+m.getClass().getName();
		
		
	}
	
	
	
	
	
	
}
