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
public class MirrorTree {

    class Node {

        Node left, right;
        int data;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    public class binarytree {

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

        public void inorder(Node root) {

            if (root == null) {
                return;
            } else {
                inorder(root.left);
                System.out.print(root.data+" ");
                inorder(root.right);
            }
        }

        public Node mirror(Node root) {
            if (root == null) {
                return root;
            } else {
                Node left = mirror(root.left);
                Node right = mirror(root.right);

                root.left = right;
                root.right = left;

                return root;
            }
        }
    }
    binarytree b = new binarytree();

    public static void main(String[] args) {
        MirrorTree m = new MirrorTree();
        binarytree b = m.b;
        for (int i = 0; i < 15; i++) {
            b.add(new Random().nextInt(20)+1);
        }
        b.inorder(b.root);
        b.mirror(b.root);
        System.out.println("After mirror :");
        b.inorder(b.root);
    }

}
