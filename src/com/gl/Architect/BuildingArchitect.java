package com.gl.Architect;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BuildingArchitect {
	
	public int numOfFloors;
	public int [] floors;
	
	
	//Get the floor details
	public void getInput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number of floors in the building");
		numOfFloors = sc.nextInt();
		
		floors = new int[numOfFloors];
		
		for(int i=0; i<numOfFloors; i++) {
			System.out.println("Enter the floor size given on Day : "+(i+1));
			floors[i] = sc.nextInt();	
		}
		sc.close();
	}	
	
	
	//Perform the order of construction
	
	public void performOrderOfConstruction() {
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer> (Collections.reverseOrder());
		
		System.out.print("\nThe Order of Construction is as follows ->");
		int max = numOfFloors;
		
		for(int i=0; i<numOfFloors; i++) {
			
			pQueue.add(floors[i]);
			
			System.out.println("\nDay :"+(i+1));
			
			while(!pQueue.isEmpty() && pQueue.peek()==max) {
				System.out.print(pQueue.poll()+" ");
				max--;				
			}
		}		
	}
}