package com.keyin;

public class Node {
    
    int key;
    int height;
    Node left;
    Node right;

    public Node(int key) {
        this.key = key;
        this.height = 1;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node [key=" + key + ", height=" + height + ", left=" + left + ", right=" + right + "]";
    }

    public void print() {
        System.out.println(this);
    }

}
