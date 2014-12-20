import java.math.MathContext;


public class Piramida {
public static void main(String[] args) {
	double strana = (double) (Math.random()*51 ) ;
	double ptrokuta =  strana * strana * Math.sqrt(3) / 4 ;
	double pkvadrata = strana * strana ;
	double ppiramide = pkvadrata + 4.0 * ptrokuta ;
	double visinapiramide = (strana * strana) - (strana / 2 ) * (strana / 2) ;
	double vpiramide = 1.0 / 3.0 * pkvadrata * visinapiramide ;
	System.out.println("Stranica") ;
	System.out.println(strana) ;
	System.out.println("Povrsina piramide") ;
	System.out.println(ppiramide) ;
	System.out.println("Volumen piramide") ;
	System.out.println(vpiramide) ;

}
	}

