/**
 * 
 */
package com.skyscraperfloorsconstruction.service;

import java.util.PriorityQueue;

/**
 * @author Sameer
 *
 */
public class SkyscraperFloorsConstructionService {

	public static void SkyscraperFloorsConstruction(int floor[], int numberOfFloor) {
		System.out.println("The order of construction is as follows");
		PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());

		int[] tempArr = new int[numberOfFloor];
		int max = numberOfFloor;

		System.out.println();

		for (int i = 0; i < numberOfFloor; i++) {
			System.out.println("Day: " + (i + 1));

			tempArr[i] = floor[i];

			queue.add(tempArr[i]);

			while (!queue.isEmpty() && queue.peek() == max) {
				System.out.println(queue.poll() + " ");

				max--;
			}
			System.out.println();
		}
	}

}
