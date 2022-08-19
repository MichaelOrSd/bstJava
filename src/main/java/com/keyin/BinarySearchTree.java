package com.keyin;

public class BinarySearchTree {
 
    Node root; 
        
    BinarySearchTree(){ 
        root = null; 
    } 

    BinarySearchTree(Node root){ 
        this.root = root; 
    } 

    void deleteKey(int key) { 
        root = deleteRec(root, key); 
    } 
    
    Node deleteRec(Node root, int key)  {
        if (root == null)  
        return root; 
    
        if (key < root.key)
            root.left = deleteRec(root.left, key); 
        else if (key > root.key)
            root.right = deleteRec(root.right, key); 
        else  { 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 

            root.key = minValue(root.right); 
    
            root.right = deleteRec(root.right, root.key); 
        } 
        return root; 
    } 
        
        int minValue(Node root)  { 
            int minValue = root.key; 
            while (root.left != null)  { 
                minValue = root.left.key; 
                root = root.left; 
            } 
            return minValue; 
        } 
        
        void insert(int key)  { 
            root = insertRec(root, key); 
        } 
        
        Node insertRec(Node root, int key) { 
            if (root == null) { 
                root = new Node(key); 
                return root; 
            } 
            if (key < root.key)
                root.left = insertRec(root.left, key); 
            else if (key > root.key)
                root.right = insertRec(root.right, key); 
            return root; 
        } 
        
        void inorder() { 
            inorderRec(root); 
        } 
        
        void inorderRec(Node root) { 
            if (root != null) { 
                inorderRec(root.left); 
                System.out.print(root.key + " "); 
                inorderRec(root.right); 
            } 
        } 
            
        boolean search(int key)  { 
            root = searchRec(root, key); 
            if (root!= null)
                return true;
            else
                return false;
        } 
        
        Node searchRec(Node root, int key)  { 
            if (root==null || root.key==key) 
                return root; 
            if (root.key > key) 
                return searchRec(root.left, key); 
            return searchRec(root.right, key); 
        } 
    }
    
    class Demo{

        public static void main(String[] args)  { 
        BinarySearchTree bst = new BinarySearchTree(); 

        bst.insert(4); 
        bst.insert(10); 
        bst.insert(7); 
        bst.insert(12); 
        bst.insert(90); 
        bst.insert(25); 

        System.out.println();
        System.out.println("BST Created with input data(Left-root-right): "); 
        bst.inorder(); 
        
        System.out.println("\nBST after Delete 12(leaf node): "); 
        bst.deleteKey(12); 
        bst.inorder(); 
        
        System.out.println("\nBST after Delete 90 (node with 1 child): "); 
        bst.deleteKey(90); 
        bst.inorder(); 
                    
        
        System.out.println("\nBST after Delete 25 (Node with two children): "); 
        bst.deleteKey(25); 
        bst.inorder(); 
        
        System.out.println("\n");
        boolean ret_val = bst.search (4);
        System.out.println("Key 4 found in BST:" + ret_val );
        ret_val = bst.search (12);
        System.out.println("Key 12 found in BST:" + ret_val );
        System.out.println();
    } 
}


