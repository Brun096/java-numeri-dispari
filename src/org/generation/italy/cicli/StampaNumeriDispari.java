package org.generation.italy.cicli;

import java.util.Scanner;
import java.util.Random;

public class StampaNumeriDispari {

	public static void main(String[]args) {
		
		Scanner scanner=new Scanner(System.in);
		//Generatori di numeri casuali
		Random random=new Random();
		
		//Var
		
		int n;
		
		//uot
		
		System.out.print("scegli un numero :");
		//in
		
		n=scanner.nextInt();
		
		//lunghezza dell'Array da n
		
		int[] nArray=new int[n];
		
		//creare un ciclo for dal numero di Array
		
		for(int i=0;i<nArray.length;i++) {
			
			//generare numeri causali in un ciclo(da 0 a 99)
			
			int nRandom=random.nextInt(100);
			
			//generare elementi all'Array
			
			nArray[i]=nRandom;
			
			//stampare solo i numeri dispari
			
			if(nArray[i] % 2 != 0) {
			
				System.out.println(nArray[i]);
				}
			}
		
		
	scanner.close();
	}}
