package com.greatlearning.construction.factoryClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DriverClass {
	static FactoryClass popelement1;
	static int prevday = 1;
	static ArrayList<FactoryClass> arraylist = new ArrayList<FactoryClass>();

	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in)) {

			int totalfloor = 0;
			System.out.println("enter the total no of floors in the building");
			totalfloor = input.nextInt();
			for (int index = 0; index < totalfloor; index++) {
				System.out.println("enter the floor size given on day: " + (index + 1));
				arraylist.add(new FactoryClass((index + 1), input.nextInt()));
			}
			FloorSize();
		}
	}

	static void FloorSize() {
		Collections.sort(arraylist);
		while (!arraylist.isEmpty()) {
			popelement1 = arraylist.remove(0);

			if (popelement1.getDay() < prevday) {
				System.out.print(popelement1.getFloor() + " ");
			} else {
				while (prevday <= popelement1.getDay()) {
					System.out.println("");
					System.out.println("Day: " + prevday);
					prevday++;
				}
				System.out.print(popelement1.getFloor() + " ");
			}
		}
	}
}
