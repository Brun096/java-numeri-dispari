package org.generation.italy.cicli;

import java.util.Random;
import java.util.Scanner;

public class Bonus {

	public static void main(String[]args) {
		
		Scanner scanner=new Scanner(System.in);
		//Generatori di numeri casuali
		Random random=new Random();
		
		//Var
		
		int n;
		int sumD=0;
		int sumA=0;
		
		//uot
		
		System.out.print("scegli un numero :");
		//in
		
		n=scanner.nextInt();
		
		
		
		int[] nArray=new int[n];
		
		
		
		for(int i=0;i<nArray.length;i++) {
			
			
			
			int nRandom=random.nextInt(100);
			
			
			
			nArray[i]=nRandom;
			
			
			
			if(nArray[i] % 2 != 0) {
			
				System.out.println(nArray[i]);
				sumD +=1;
				
				}
			
			if(nArray[i]>10 && nArray[i]<50) {
				
				sumA+=nArray[i];
			}
			}
			
		
		
		System.out.println("i numeri dispari sono: "+sumD);
		System.out.println("i numeri pari sono:  "+(n-sumD));
		System.out.println("la somma dei numeri compresi da 10 e 50 (estremi esclusi) è di: "+sumA);
		
		
	scanner.close();
	}
}
