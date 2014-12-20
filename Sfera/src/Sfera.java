
public class Sfera {
	public static void main(String[] args) {
		double precnik = (double) (Math.random()*51 ) ;
		double psfere = 4.0 * Math.PI * precnik * precnik ;
		double vsfere = (4.0 * Math.PI * precnik * precnik * precnik) / 3.0 ;
		System.out.println("Precnik") ;
		System.out.println(precnik) ;
		System.out.println("Povrsina sfere") ;
		System.out.println(psfere) ;
		System.out.println("Volumen sfere") ;
		System.out.println(vsfere) ;
	
	}
		
}
