package v1;

public class Vezbe2 {

	public static void zbir(int a, int b){
		int suma=0;
		int brojac=0;
		
		while(a<=b) {
			if(a%3==0) {
				suma=suma+a;
				brojac++;
			}
				a++;
		}
		sredina(suma,brojac);
		System.out.println(suma);
	}
	
	public static void sredina(int suma, int brojElem) {
		double arSred=suma/brojElem;
		System.out.println(arSred);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zbir(12,15);
	}

}
