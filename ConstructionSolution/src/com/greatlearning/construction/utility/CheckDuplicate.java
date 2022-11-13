package com.greatlearning.construction.utility;

import java.util.ArrayList;

import com.greatlearning.construction.model.FactoryClass;

public class CheckDuplicate {
	public static boolean DuplicateValidate(ArrayList<FactoryClass> arraylist) {
		int current = 0;
		boolean duplicateVal = false;

		while (current < arraylist.size()) {
			int j = 0;
			while (j < current) {
				if (arraylist.get(current).getFloor() == arraylist.get(j).getFloor()) {
					duplicateVal = true;
				}
				j++;
			}
			current++;
		}
		return duplicateVal;
	}
}
