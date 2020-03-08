
package DataStructuresInJava;

import java.util.Random;


public class BinaryTree {

    Node root;

    class Node {

        Node right, left;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public void add(int value) {

        if (root == null) {
            root = new Node(value);
        } else {
            insert(root, value);
        }

    }

    private void insert(Node node, int value) {
        if (value > node.data) {

            if (node.right == null) {
                node.right = new Node(value);
            } else {
                insert(node.right, value);
            }

        } else    if (value < node.data){
            if (node.left == null) {
                node.left = new Node(value);
            } else {
                insert(node.left, value);
            }

        }
    }

      public void print(){
          printdata(root);
      
      
      }
    
    private void printdata(Node node) {
        if (node == null) {
            return;
        }

        printdata(node.left);
        System.out.println(node.data);
        printdata(node.right);
              
        
    }

    public static void main(String[] args) {
        BinaryTree b=new BinaryTree();
        for (int i = 0; i < 10; i++) {
            b.add(new Random().nextInt(10)+10);
        }
        b.print();       
    }

}
