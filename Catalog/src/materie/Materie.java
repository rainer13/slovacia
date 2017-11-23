 package materie;

import java.util.ArrayList;

public  abstract class Materie {
	
	
	
	public int  getMedie(ArrayList<Integer> note) {
		
		int s=0,nr=0;
		
		for(int i:note) {
			s+=i;
			nr++;}
		double f=1.0*s/nr;
		Double d=new Double(f);
		return d.intValue();
		
		
	};
	
	
	
	public int  getMedieCuNotaInTeza(ArrayList<Integer> note, int notaInTeza) {
		
		int s=0,nr=0;
		
		for(int i:note) {
			s+=i;
			nr++;}
		double f=1.0*s/nr;
		double n=((3*f)+notaInTeza)/4;
		Double d=new Double(n);
		return d.intValue();
		
	
	}
	

}
