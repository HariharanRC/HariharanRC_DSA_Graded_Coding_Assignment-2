package com.gl.BSTtoSkew;

class Node
{
    int val;
    Node left,right;
    Node(int val)
    {
        this.val=val;
        left=right=null;
    }
}
class BSTMain
{
    Node node;
    Node prev = null;
    Node newNode = null;
    void performBST(Node root)
    {
        if(root == null)return;
        performBST(root.left);
        Node rightNode = root.right;
//      Node leftNode = root.left;
     
        if(newNode == null)
        {
            newNode = root;
            root.left = null;
            prev = root;
        }
        else
        {
            prev.right = root;
            root.left = null;
            prev = root;
        }
        performBST(rightNode);
    }  
    void traverse(Node root)
    {
        if(root == null)return;
        System.out.print(root.val + " ");
        traverse(root.right);       
    }
    public static void main(String[] args) {
       
        BSTMain tree = new BSTMain();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left= new Node(55);       
        tree.performBST(tree.node);
        tree.traverse(tree.newNode);
    }
}
