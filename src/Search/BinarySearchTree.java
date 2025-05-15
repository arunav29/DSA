package Search;
class BinaryNode {
	int data;
	BinaryNode left;
	BinaryNode right;
	public BinaryNode(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
}
public class BinarySearchTree {
	// The ROOT node. Any operation on the tree starts from the root node.
	// Ensure that the root node reference remains unaltered unless the operation
	// is on the root node itself.
	BinaryNode root;
	
	/*
	 * DELETION on a BST
	 * (a) locate the node to be deleted
	 * (b) identify the parent node of the node-to-be-deleted
	 * Case 1: Deletion of a leaf node
	 */
	// locate the node to be deleted
	// Parameters: (1) root node (p) and (2) the element to be deleted
	public BinaryNode locateitem(BinaryNode p, int theelement) {
		boolean found = false; // a flag to identify if the element was located
		if(p!=null) {   // checking the BST is empty
			if(theelement == p.getData()) {
				found = true;
				return p;
			} else if(theelement < p.getData()) {
				p = locateitem(p.left, theelement);
			} else {
				p = locateitem(p.right, theelement);
			}
		}
		if(!found) {
			p = null;
		}
		return p;
	}
	
	public BinaryNode findParentNode(BinaryNode temproot, BinaryNode delnode) {
		BinaryNode parent = null;
		// start search from the ROOT and branch to the left subtree or right subtree
		// continuosly till the 'delnode' is found or else you end-up at a leaf node
		// not equal to 'delnode' meaning the 'delnode' is not present in the tree
		while(temproot != delnode) {
			parent = temproot;
			if(delnode.getData() < temproot.getData()) {
				temproot = temproot.left;
			} else {
				temproot =  temproot.right;
			}
		}
		return parent;
	}
	
	public void delete(BinaryNode rootnode, int data) {
		
		// we get in return the node-to-be-deleted
		BinaryNode delnode =  locateitem(rootnode, data);
		if(delnode == null) {
			System.out.println("either BST doesn't exist or the '"+data+"' is not present in the BST");
			return;
		}
		// we get in return the parent node of the node-to-be-deleted
		BinaryNode  parent = findParentNode(rootnode, delnode);
		// Case 1: Deletion of a leaf node
		if(delnode.left == null && delnode.right==null) {
			if(parent != null) {
				if(parent.getData() > delnode.getData()) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			} else {
				root = null;
			}
		}
		// Case 2: 
		else if(delnode.left==null || delnode.right==null) {
			if(parent != null) {
				// if there is no left subtree to the node-to-be-deleted,
				// then make its right subtree as
				// the parent node's left subtree or right subtree depending on
				// whether the data of the node-to-be-deleted is smaller or larger 
				// than the parent node's data correspondingly
				if(delnode.left == null) {
					if(parent.getData() > delnode.getData()) {
						parent.left = delnode.right;
					} else {
						parent.right = delnode.right;
					}
				} else {
					if(parent.getData() > delnode.getData()) {
						parent.left = delnode.left;
					} else {
						parent.right = delnode.left;
					}
				}
			} else {
				if(delnode.left == null) {
					root = rootnode.right;
				} else {
					root = rootnode.left;
				}
			}
		}
		// Case 3:
		else if(delnode.left!=null && delnode.right!=null) {
			BinaryNode x = delnode.left;  // x has the root of the left-subtree of the node-to-be-deleted
			// find the right-most descendant in the left-subtree of the node-to-be-deleted
			while(x.right != null) {
				x = x.right;
			}
			x.right = delnode.right;
			
			if(parent!=null) {
				if(parent.right == delnode) {
					parent.right = delnode.left;
				} else {
					parent.left = delnode.left;
				}
			} else {
				root = rootnode.left;
			}
			
		}
	}
	/*
	 * INSERTION into a Binary Search Tree
	 * Case 1: Empty Tree - The new node created becomes the ROOT node
	 * Case 2: Non-empty Tree - Insertion of new node can happen either 
	 * to the left subtree or to the right subtree depending on if the data
	 * is larger or smaller than the present subtree's root 
	 */
	public void insert(BinaryNode temp, int data) {
		// Case 1: empty tree - the new node created becomes the ROOT node
		if(temp == null) {
			temp = new BinaryNode(data);
			root = temp;
			System.out.println(data+" has been inserted into the tree as root");
			return;
		}
		
		// Case 2:
		// compare the data with the current node's data, if the data to be inserted is
		// smaller then branch to the left subtree, otherwise branch to the right subtree
		if(data < temp.getData()) {
			// if 'left' is null, it implies there is no left subtree, then insert the new node
			// as left child of current node
			if(temp.left == null) {
				temp.left = new BinaryNode(data);
				System.out.println(data+" has been inserted into the tree as left child");
				return;
			} else {
				insert(temp.left, data);
			}
		} else {
			// if 'right' is null, it implies there is no right subtree, then insert the new node
			// as right child of current node
			if(temp.right == null) {
				temp.right =  new BinaryNode(data);
				System.out.println(data+" has been inserted into the tree as right child");
				return;
			} else {
				insert(temp.right, data);
			}
		}
	}
	 void display(BinaryNode p) {
		if(p!= null) {
			display(p.left);
			System.out.println(p.getData()+", ");
			display(p.right);
		}
	}
	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		b.insert(b.root, 12);
		b.insert(b.root, 10);
		b.display(b.root);
	}
}