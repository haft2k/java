package tree;
/**
 * @version 1.00 April 21, 2022 GumBox, Inc
 * @author github: tdh2000
 *
 */
class BinarySearchTree {
    private TreeNode rootNode;

    /**
     * find node data
     *
     * @param data
     * @return TreeNode
     */
    TreeNode find(int data) {

	if (rootNode != null) {
	    return rootNode.find(data);
	}

	return null;
    }

    /**
     * insert node data
     * use function insert of TreeNode
     *
     * @param integer
     *
     */
    void insert(int data) {
	if (rootNode == null) {
	    this.rootNode = new TreeNode(data);
	} else {
	    rootNode.insert(data);
	}
    }

    /**
     * Delete node
     *
     * case 1: Node is a leaf
     * case 2: Node have a child
     * case 3: Node have 2 childs
     *
     * @param data
     */
    void delete(Integer data) {
	TreeNode current = this.rootNode;
	TreeNode parent = this.rootNode;
	boolean isLeftChild = false;

	// if rootNode is null
	if (current == null) {
	    return;
	}

	/* case 1: delete node leaf */
	// use loop iterative find data
	while (current != null && current.getData() != data) {
	    parent = current;

	    if (data < current.getData()) {
		current = current.getLeft();
		isLeftChild = true;

	    } else {
		current = current.getRight();
		isLeftChild = false;
	    }
	}

	// end if current left || right next node is null
	if (current == null) {
	    return;
	}

	// if left && right no have data
	// set nextNode to null
	if (current.getLeft() == null && current.getRight() == null) {
	    if (current == rootNode) {
		rootNode = null;

	    } else {
		if (isLeftChild) {
		    parent.setLeft(null);
		} else {
		    parent.setRight(null);
		}
	    }


	}
	/* case 2: deleted has one child */

	// if right no child
	//
	else if (current.getRight() == null) {

	    if (current == rootNode) {
		rootNode = current.getLeft();

	    } else if (isLeftChild) {
		parent.setLeft(current.getLeft());

	    } else {
		parent.setRight(current.getLeft());
	    }

	}
	// if left no child
	else if (current.getLeft() == null) {
	    if (current == rootNode) {
		rootNode = current.getRight();

	    } else if (isLeftChild) {
		parent.setLeft(current.getRight());

	    } else {
		parent.setRight(current.getRight());
	    }

	}

	/* case 3: Delete with node have two childs */
	// use function isDeleted() mark node deleted
	//
	TreeNode toDel = find(data);
	toDel.isDeleted();
    }



    /**
     * Pre-order Traversal Tree
     *
     * step 1: root
     * step 2: recursion left child
     * step 3: recursion right child
     *
     */
    void preOrder(TreeNode rootNode) {

	System.out.print(rootNode.getData() + " ");

	preOrder(rootNode.getLeft());

	preOrder(rootNode.getRight());
    }

    /**
     *  in-order Traversal Tree
     *
     * step 1: recursion left child
     * step 2: root
     * step 3: recursion right child
     *
     */
    void inOrder(TreeNode roodNode) {

	inOrder(rootNode.getLeft());

	System.out.print(rootNode.getData() + " ");

	inOrder(rootNode.getRight());
    }

    /**
     * post-order Traversal Tree
     *
     * step 1: recursion left child
     * step 2: recursion right child
     * step 3: root
     *
     */
    void postOrder(TreeNode rootNode) {

	postOrder(rootNode.getLeft());

	postOrder(rootNode.getRight());

	System.out.print(rootNode.getData() + " ");
    }

}

