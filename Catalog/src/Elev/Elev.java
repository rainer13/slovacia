package Elev;
import java.util.HashSet;

public class Elev {

	public String nume,prenume,numarMatricol;
	public static HashSet<String> a=new HashSet<String>();
	
	
	
	public Elev(String n,String p, String nm) {
		
		if(a.contains(nm))
			throw new IllegalArgumentException();
		numarMatricol=nm;
		a.add(numarMatricol);
		
		nume=n;
		prenume=p;
	}
	
	
}
