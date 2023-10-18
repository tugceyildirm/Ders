package Indeks;

import java.util.Scanner;

public class IndeksHesaplama {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
	    float kilo;
	    float boy;
	    float oran;
	    float boyunkaresi;
	    
	    System.out.print(" Kilonuzu Giriniz(kg):");
	    kilo = input.nextFloat();
	    System.out.print("Boyunuzu Giriniz(Metre ÖRN= 1.50):");
	    boy = input.nextFloat();
	    boyunkaresi = boy*boy;
	    oran= kilo / boyunkaresi;
	    
	    if (oran < 18.5)
	    	System.out.println("İdeal kilonuzun altındasınız(zayıf).");
	    
	    if(oran >= 18.5 && oran <24.9)
	    	System.out.println("ideal kilonuzdasınız(normal).");
	    
	    if (oran >= 24.9 && oran < 29.9)
	    	System.out.println("İdeal kilonuzdan fazla(şişman).");
	    if ( oran >= 30) 
	    	System.out.println("İdeal kilonuzdan çok fazlasınız(obez).");
	    
	    
	    
	}

}
