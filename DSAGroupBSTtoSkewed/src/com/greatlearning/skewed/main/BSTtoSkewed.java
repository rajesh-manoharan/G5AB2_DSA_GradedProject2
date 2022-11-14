package com.greatlearning.skewed.main;

import com.greatlearning.skewed.utility.NodeBST;

public class BSTtoSkewed {

	static NodeBST prevNode = null;
	static NodeBST skewRoot = null;

	static NodeBST convertBSTtoSkewed(NodeBST root) {

		if (root == null) {
			return null;
		}
		convertBSTtoSkewed(root.left);

		root.left = null;

		if (skewRoot == null) {
			skewRoot = root;
		} else {
			prevNode.right = root;
		}
		prevNode = root;
		convertBSTtoSkewed(root.right);
		return skewRoot;
	}
}
