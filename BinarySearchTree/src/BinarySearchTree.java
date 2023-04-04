public class BinarySearchTree {
    private TreeNode root;
    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data=data;
        }
    }

    public TreeNode insert(TreeNode root, int val){
        if(root==null){
            root=new TreeNode(val);
            return root;
        }
        if (val< root.data){
            root.left = insert(root.left,val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public TreeNode seacrch(TreeNode root, int key){
        if (root==null || root.data==key){
            return root;
        }
        if(root.data<key){
            return seacrch(root.left,key);
        }
        else {
            return seacrch(root.right,key);
        }
    }
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(binarySearchTree.root, 10);
        binarySearchTree.insert(binarySearchTree.root, 20);
        binarySearchTree.insert(binarySearchTree.root, 30);
    }
}