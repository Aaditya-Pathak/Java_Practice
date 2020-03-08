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
public class InorderSucessor {
//
//    Node root;
//
//class Node { 
//  
//    int data; 
//    Node left, right, parent; 
//  
//    Node(int d) { 
//        data = d; 
//        left = right = parent = null; 
//    } 
//} 
//
//    public void add(int value) {
//
//        if (root == null) {
//            root = new Node(value);
//        } else {
//            insert(root, value);
//        }
//
//    }
//
//    private void insert(Node node, int value) {
//        if (value > node.data) {
//
//            if (node.right == null) {
//                node.right = new Node(value);
//            } else {
//                insert(node.right, value);
//            }
//
//        } else if (value < node.data) {
//            if (node.left == null) {
//                node.left = new Node(value);
//            } else {
//                insert(node.left, value);
//            }
//
//        }
//    }
//
//    public void print() {
//        printdata(root);
//
//    }
//
//    private void printdata(Node node) {
//        if (node == null) {
//            return;
//        }
//
//        printdata(node.left);
//        System.out.println(node.data);
//        printdata(node.right);
//
//    }
//
//    public Node inordersuccessor(Node node) {
//        int diff = node.data - node.right.data;
//        int value = node.data;
//        Node n = new Node(0);
//        while (node.right != null) {
//            if ((node.data - value) < diff) {
//                diff = node.data - value;
//                if ((node.right.data - value) > diff) {
//                    diff = node.data - node.left.data;
//                    while (node.left != null) {
//                        if ((node.data - value) > diff) {
//                            diff = node.data - value;
//                            n = node;
//                        }
//                    }
//
//                }
//            }
//        }
//        return n;
//    }
//    
//    public static void main(String[] args) {
//        InorderSucessor b = new InorderSucessor();
//        for (int i = 0; i < 15; i++) {
//            b.add(i);
//        }
//        Node n= b.root.left;
//        b.print();
//        System.out.println("the inorder sucessor of the root node is : ");
//        b.inordersuccessor(b.root,n);

    class Node {

        int data;
        Node left, right, parent;

        Node(int d
        ) {
            data = d;
            left = right = parent = null;
        }
    }

    class BinaryTree {

        Node head;

        Node insert(Node node, int data) {

            if (node == null) {
                return (new Node(data));
            } else {

                Node temp = null;
                if (data <= node.data) {
                    temp = insert(node.left, data);
                    node.left = temp;
                    temp.parent = node;

                } else {
                    temp = insert(node.right, data);
                    node.right = temp;
                    temp.parent = node;
                }

                return node;
            }
        }

        Node inOrderSuccessor(Node root, Node n) {

            if (n.right != null) {
                return minValue(n.right);
            }

            Node p = n.parent;
            while (p != null && n == p.right) {
                n = p;
                p = p.parent;
            }
            return p;
        }

        Node minValue(Node node) {
            Node current = node;

            while (current.left != null) {
                current = current.left;
            }
            return current;
        }
    }

    BinaryTree tree = new BinaryTree();

    public static void main(String[] args) {
        InorderSucessor b = new InorderSucessor();
        BinaryTree tree = b.tree;
        Node root = null, temp = null, suc = null, min = null;
        for (int i = 0; i < 100; i++) {
            root = tree.insert(root, new Random().nextInt(110) + 2);
        }

        temp = root.left.left.left;
        suc = tree.inOrderSuccessor(root, temp);
        if (suc != null) {
            System.out.println("Inorder successor of " + temp.data
                    + " is " + suc.data);
        } else {
            System.out.println("Inorder successor does not exist");
        }
    }

}
