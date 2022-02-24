
public class Pro129 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int sumNumbers(TreeNode root) {
		int count = 0;
		if (root == null) {
			return count;
		}
		if (root.left == null && root.right == null) {
			count += root.val;
		} else {
			if (root.left != null) {
				root.left.val += root.val * 10;
				count += sumNumbers(root.left);
			}
			if (root.right != null) {
				root.right.val += root.val * 10;
				count += sumNumbers(root.right);
			}
		}

		return count;

	}

	public static void main(String[] args) {

	}

}
