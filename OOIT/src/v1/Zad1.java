package v1;

public class Zad1 {

	public static void main(String[] args) {
		/*
		int i=0;
		while (i<=10) {
			i++;
			if(i%5==0) {
				continue;
			}
			System.out.println("Ja volim programiranje");
		}
		*/
		Kljucna k1=new Kljucna();
		Kljucna k2=new Kljucna();
		
		for(int i=0;i<=10;i++) {
			Kljucna.broj=Kljucna.broj+i;
		}
		Kljucna.ispisiBroj();
		
		System.out.println(k1.broj);
		System.out.println(k2.broj);
		}
	}


