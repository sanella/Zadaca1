
public class Ispisbr {
		public static void main(String[] args) {
			int broj = (int) (10000 + Math.random() * (90000)) ;
			int petibroj = (int) broj / 10000 ;
			int petiostatak = (int) broj % 10000 ;
			int cetvrtibroj = (int) petiostatak / 1000 ;
			int cetvrtiostatak = (int) petiostatak % 1000 ;
			int trecibroj = (int) cetvrtiostatak / 100;
			int treciostatak = (int) cetvrtiostatak % 100;
			int drugibroj = (int) treciostatak / 10;
			int drugiostatak = (int) treciostatak % 10;
			int prvibroj = (int) drugiostatak;
			System.out.println("Prvi smjer");
			System.out.println(broj);
			System.out.println(petibroj);
			System.out.println(cetvrtibroj);
			System.out.println(trecibroj);
			System.out.println(drugibroj);
			System.out.println(prvibroj);
			System.out.println("Drugi smjer");
			System.out.println(broj);
			System.out.println(prvibroj);
			System.out.println(drugibroj);
			System.out.println(trecibroj);
			System.out.println(cetvrtibroj);
			System.out.println(petibroj);
		}
}
