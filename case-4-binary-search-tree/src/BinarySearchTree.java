public class BinarySearchTree {
    private Node root;
    
    public BinarySearchTree() {
        this.root = null;
    }
    
    // Method untuk insert node baru
    public void insert(int data) {
        root = insertRec(root, data);
    }
    
    // Recursive method untuk insert
    private Node insertRec(Node root, int data) {
        // Jika tree kosong, buat node baru
        if (root == null) {
            root = new Node(data);
            return root;
        }
        
        // Jika data lebih kecil dari root, insert ke left subtree
        if (data < root.getData()) {
            root.setLeft(insertRec(root.getLeft(), data));
        }
        // Jika data lebih besar dari root, insert ke right subtree
        else if (data > root.getData()) {
            root.setRight(insertRec(root.getRight(), data));
        }
        // Jika data sama, tidak insert (duplicate)
        
        return root;
    }
    
    // Method untuk mencari node dengan data tertentu
    public boolean search(int data) {
        return searchRec(root, data);
    }
    
    // Recursive method untuk search
    private boolean searchRec(Node root, int data) {
        if (root == null || root.getData() == data) {
            return root != null;
        }
        
        if (data < root.getData()) {
            return searchRec(root.getLeft(), data);
        }
        
        return searchRec(root.getRight(), data);
    }
    
    // Method untuk mendapatkan height tree
    public int getHeight() {
        return getHeightRec(root);
    }
    
    // Recursive method untuk menghitung height
    private int getHeightRec(Node root) {
        if (root == null) {
            return 0;
        }
        
        int leftHeight = getHeightRec(root.getLeft());
        int rightHeight = getHeightRec(root.getRight());
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
    
    // Method untuk mendapatkan jumlah node
    public int getSize() {
        return getSizeRec(root);
    }
    
    // Recursive method untuk menghitung jumlah node
    private int getSizeRec(Node root) {
        if (root == null) {
            return 0;
        }
        
        return getSizeRec(root.getLeft()) + getSizeRec(root.getRight()) + 1;
    }
}
