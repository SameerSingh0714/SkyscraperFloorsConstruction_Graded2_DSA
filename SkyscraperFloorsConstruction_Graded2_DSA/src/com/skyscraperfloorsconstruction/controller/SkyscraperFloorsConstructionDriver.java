/**
 * 
 */
package com.skyscraperfloorsconstruction.controller;

import java.util.Scanner;

import com.skyscraperfloorsconstruction.service.SkyscraperFloorsConstructionService;

/**
 * @author Sameer
 *
 */
public class SkyscraperFloorsConstructionDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entet the total number of floors in the building");
		
		int numberOfFloor =scanner.nextInt();
		
		int []floor = new int[numberOfFloor];

		for (int i = 0; i < numberOfFloor; i++) {
			System.out.println("Enter the floor size given on day: "+(i+1));
			floor[i] =scanner.nextInt();
			
		}
		System.out.println();
		
		SkyscraperFloorsConstructionService service = new SkyscraperFloorsConstructionService();
		SkyscraperFloorsConstructionService.SkyscraperFloorsConstruction(floor, numberOfFloor);
		
	}

}
