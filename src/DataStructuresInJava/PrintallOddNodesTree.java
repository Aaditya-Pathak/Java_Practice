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
public class PrintallOddNodesTree {

//    Node root, A;
//
//    class Node {
//
//        Node right, left;
//        int data;
//
//        public Node(int data) {
//            this.data = data;
//        }
//    }
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
//    public void printodd() {
//        if (root == null) {
//            root = A;
//            A = null;
//            return;
//        }
//        if ((root.data % 2) != 0) {
//            System.out.println(root.data);
//        }
//
//        if (root.left != null) {
//            root = root.left;
//            printodd();
//        }
//        if (root == null || root.left == null||root.right==null) {
//            root = A;
//            A = null;
//            return;
//        }
//        if (root.right != null) {
//            root = root.right;
//            printodd();
//        }
//    }
//
//    public static void main(String[] args) {
//        PrintallOddNodesTree b = new PrintallOddNodesTree();
//        for (int i = 0; i < 10; i++) {
//            b.add(new Random().nextInt(10) + 10);
//        }
//        b.print();
//        System.out.println("Value of all odd valued nodes : ");
//        b.A = b.root;
//        b.printodd();
//    }
    static class Node {

        int key;
        Node left, right;
    }

    static Node newNode(int item) {
        Node temp = new Node();
        temp.key = item;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    static Node insert(Node node, int key) {

        if (node == null) {
            return newNode(key);
        }
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else {
            node.right = insert(node.right, key);
        }

        return node;
    }

    static void oddNode(Node root) {
        if (root != null) {
            oddNode(root.left);

            if (root.key % 2 != 0) {
                System.out.print(root.key + " ");
            }

            oddNode(root.right);
        }
    }

    public static void main(String[] args) {

        Node root = null;
        root = insert(root, 5);
        root = insert(root, 3);
        root = insert(root, 2);
        root = insert(root, 4);
        root = insert(root, 7);
        root = insert(root, 6);
        root = insert(root, 8);

        oddNode(root);

    }

}
