package com.greatlearning.construction.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.greatlearning.construction.model.FactoryClass;
import com.greatlearning.construction.utility.CheckDuplicate;

public class DriverClass {
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
			if (!CheckDuplicate.DuplicateValidate(arraylist)) {
				CalculateFloor.FloorSize(arraylist);
			} else {
				System.out.println("Duplicate floor size constructed!!!");
			}

		} catch (Exception e) {
			System.out.println("Invalid input");
		}
	}
}