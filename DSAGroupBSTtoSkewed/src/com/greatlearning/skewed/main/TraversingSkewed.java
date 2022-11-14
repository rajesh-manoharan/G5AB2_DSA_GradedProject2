package com.greatlearning.skewed.main;

import com.greatlearning.skewed.utility.NodeBST;

public class TraversingSkewed {

	public static void traversingSkewed(NodeBST root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data + " ");
		traversingSkewed(root.right);
	}
}
