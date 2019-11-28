package Basic9;

class BinaryNode {
	int data;
	BinaryNode left;
	BinaryNode right;

	public BinaryNode(int d) {
		data = d;
		left = right = null;
	}

	// getter and setter of data
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}

class BinarySearchTree {
	private BinaryNode root;

	public BinarySearchTree() {
		root = null;
	}

	void insert(int data) {
		root = insertRec(root, data);
	}

	// To compare the value between the root data and the data
	BinaryNode insertRec(BinaryNode root, int data) {

		if (root == null) {
			root = new BinaryNode(data);
			return root;
		}

		if (data < root.data)
			root.left = insertRec(root.left, data);
		else if (data > root.data)
			root.right = insertRec(root.right, data);

		return root;
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

	// insert a tree to test is that works
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(2);
		tree.insert(27);
		tree.insert(49);
		tree.insert(47);
		tree.insert(19);
		tree.insert(53);
		tree.insert(38);
		tree.insert(64);
		tree.insert(7);
		tree.insert(87);

		tree.inorder();
	}
}