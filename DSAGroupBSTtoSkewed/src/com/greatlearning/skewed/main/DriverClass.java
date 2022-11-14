package com.greatlearning.skewed.main;

import java.util.Scanner;

import com.greatlearning.skewed.utility.InsertBST;
import com.greatlearning.skewed.utility.NodeBST;

public class DriverClass {

	public static void main(String args[]) {
		int acceptbst = 1;
		try (Scanner sc = new Scanner(System.in)) {
			NodeBST root = null;
			NodeBST headNode = null;

			while (acceptbst == 1) {
				System.out.println("Input BST value one by one :");
				root = InsertBST.insert(root, sc.nextInt());
				if (headNode == null) {
					headNode = root;
				}
				System.out.println("Enter 1 to enter more values: ");
				acceptbst = sc.nextInt();
			}
			headNode = BSTtoSkewed.convertBSTtoSkewed(headNode);
			TraversingSkewed.traversingSkewed(headNode);
		} catch (Exception e) {
			System.out.println("Invalid input!!!");
		}
	}
}
