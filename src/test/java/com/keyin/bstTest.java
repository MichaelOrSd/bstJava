package com.keyin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class bstTest {

    BinarySearchTree bst = new BinarySearchTree();

    @Test
    public void insertTest() {
        
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);

        assertEquals(50, bst.root.key);
        assertEquals(30, bst.root.left.key);
        assertEquals(20, bst.root.left.left.key);
        assertEquals(40, bst.root.left.right.key);
        assertEquals(70, bst.root.right.key);

        bst.root.print();
    }

    @Test
    public void searchTest() {

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);

        assertEquals(true, bst.search(50));
        assertEquals(true, bst.search(30));
        assertEquals(true, bst.search(20));
        
        assertEquals(false, bst.search(40));
        assertEquals(false, bst.search(70));

        assertEquals(false, bst.search(60));
        assertEquals(false, bst.search(80));

    }

    @Test
    public void deleteTest() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);

        bst.deleteKey(20);

        assertEquals(50, bst.root.key);
        assertEquals(30, bst.root.left.key);

        assertTrue(bst.root.left.left == null);
        
        assertEquals(40, bst.root.left.right.key);
        assertEquals(70, bst.root.right.key);
        
        bst.root.print();
    }


}
