/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresInJava;

import java.util.Random;

/**
 *
 * @author aditya
 */
public class Tree_traveral_all {

    class Node {

        Node left, right;
        int data;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    Node root;

    public void add(int value) {

        if (root == null) {
            root = new Node(value);
        } else {
            insert(root, value);
        }

    }

    private void insert(Node node, int value) {
        if (node != null) {
            if (value > node.data) {

                if (node.right == null) {
                    node.right = new Node(value);
                } else {
                    insert(node.right, value);
                }

            } else if (value < node.data) {
                if (node.left == null) {
                    node.left = new Node(value);
                } else {
                    insert(node.left, value);
                }

            }
        }
    }

    void printLevelOrder() {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++) {
            printGivenLevel(root, i);
        }
    }

    int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            int lheight = height(root.left);
            int rheight = height(root.right);

            if (lheight > rheight) {
                return (lheight + 1);
            } else {
                return (rheight + 1);
            }
        }
    }

    public void printGivenLevel(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.println(root.data + " ");
        } else {
            printGivenLevel(root.left,level-1);
            printGivenLevel(root.right,level-1);
        }
    }
    
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[]args){
         Tree_traveral_all t=new Tree_traveral_all();
         for (int i = 0; i < 15; i++) {
            t.add(new Random().nextInt(10)+10);
        }
         System.out.println("Inorder");
         t.inorder(t.root);
         System.out.println("\nPreorder");
         t.preorder(t.root);
         System.out.println("\nPostorder");
         t.postorder(t.root);
         System.out.println("\nLeveltraversal");
         t.printGivenLevel(t.root,2
         );
    }
}
