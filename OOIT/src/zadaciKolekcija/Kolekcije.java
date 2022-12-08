package zadaciKolekcija;

public class Kolekcije {

	public static void main(String[] args) {
		//zadatak 1
		/*
		int [] niz= {4,5,6,7,8};
		
		for(int i=niz.length - 1;i>=0;i-- ) {
			System.out.print(niz[i] + " ");
		}
		*/
		
		//zadatak 2
		/*
		int [] niz= {4,20,33,2,88,5};
		if(niz[2]>niz[3]) {
			System.out.println("Treci element je veci od cevrtog za: " +(niz[2]-niz[3]));
		}else {
			System.out.println("Treci element je veci od cevrtog za: " +(niz[2]-niz[3]));
			}
		*/
		
		//zadatak 3
		/*
		int [] niz= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<niz.length;i++) {
			niz[i] *=5;  //niz[i]=niz[i]*5
			System.out.println( niz[i]);
		}
		*/
		
		int [] niz= {15,13,77,18,24,66,48,12,31};
		int najveci=0;
		int najmanji=0;
		for(int i=niz.length-1;i>=0;i--) {
			if(i>i-1 && i>i-2 && i>i-3 && i>i-4 && i>i-5 && i>i-6 && i>i-7 && i>i-8 && i>i-9) {
				najveci=i;
			}else {
				i--;
			}
			System.out.println("Najveci je: " + najveci);
			else(i<i-1 && i<i-2 && i<i-3 && i<i-4 && i<i-5 && i<i-6 && i<i-7 && i<i-8 && i<i-9){
				najmanji=i;
				System.out.println("Najveci je: " + najmanji);
			}

		}
	}
}
