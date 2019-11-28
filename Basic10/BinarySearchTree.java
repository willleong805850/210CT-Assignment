package Basic10;

class BinaryNode {
	int data;
	BinaryNode left;
	BinaryNode right;

	public BinaryNode(int d) {
		data = d;
		left = right = null;
	}

	// getter for data
	public int getData() {
		return data;
	}
}

class BinarySearchTreeDel {
	private BinaryNode root;

	public BinarySearchTreeDel() {
		root = null;
	}

	void insert(int data) {
		root = insertRec(root, data);
	}

	// Function to insert the new key
	BinaryNode insertRec(BinaryNode root, int data) {

		// If the root is empty, return new data
		if (root == null) {
			root = new BinaryNode(data);
			return root;
		}

		// If it is not null, compare the value and put it in proper position
		if (data < root.data)
			root.left = insertRec(root.left, data);
		else if (data > root.data)
			root.right = insertRec(root.right, data);

		return root;
	}

	// Function to find out the Min value
	private BinaryNode findMin(BinaryNode t) {
		if (t == null)
			return null;
		else if (t.left == null)
			return t;
		else
			return findMin(t.left);
	}

	// Function to delete the node
	private BinaryNode deleteSubtree(BinaryNode t, int d) {

		if (t == null)
			return null;
		if (d < t.data)
			t.left = deleteSubtree(t.left, d);
		else if (d > t.data)
			t.right = deleteSubtree(t.right, d);
		else if (t.left != null && t.right != null) {
			t.data = findMin(t.right).data;
			t.right = deleteSubtree(t.right, t.data);
		} else
			t = (t.left != null) ? t.left : t.right;
		return t;
	}

	void delete(int x) {
		root = deleteSubtree(root, x);
	}

	void inorder() {
		inorderRec(root);
	}

	void inorderRec(BinaryNode root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.data);
			inorderRec(root.right);
		}
	}

	public static void main(String[] args) {
		BinarySearchTreeDel tree = new BinarySearchTreeDel();
		int data = 0;
		tree.insert(8);
		tree.insert(7);
		tree.insert(9);
		tree.insert(4);
		tree.insert(1);
		tree.insert(18);
		tree.insert(3);
		tree.insert(6);
		tree.insert(0);
		tree.insert(13);

		tree.inorder();

		System.out.println("delete 13 and 0");
		tree.delete(13);
		tree.delete(0);

		tree.inorder();
	}
}