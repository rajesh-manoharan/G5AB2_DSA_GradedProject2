package com.greatlearning.skewed.utility;

public class InsertBST {
	public static NodeBST insert(NodeBST root, int key) {
		if (root == null) {
			return new NodeBST(key);
		}
		if (key < root.data) {
			root.left = insert(root.left, key);
		} else {
			root.right = insert(root.right, key);
		}
		return root;
	}
}
