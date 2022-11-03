package v1;

import java.util.Scanner;

public class Vezbe {
	
	public static void ispis(int a, int b) {
		if(a>b) {
			System.out.println("Niste uneli dobar opseg");
		}else {
			
		while(a<=b) {
			System.out.println(a);
			a++;
		}
		}
				
	}

	public static void main(String[] args) {
		/*
		int broj1=5;
		int broj2=10;
	
		
		int zbir=broj1 + broj2;
		
		System.out.println("Zbir je:" + zbir);
		*/
		
		ispis(5,10);
	}
	

}
