/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresInJava;

import java.util.Random;
import java.util.Stack;

/**
 *
 * @author aditya
 */
public class ConvertTreeToLinkeslist {

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

        } else if (value < node.data) {
            if (node.left == null) {
                node.left = new Node(value);
            } else {
                insert(node.left, value);
            }

        }
    }

    public void print() {
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
    
    public Node solution() 
{ 
  
    // Declare a stack 
    Stack<Node> st = new Stack<>();
    Node A=root;
    Node ans = A; 
  
    // Iterate till the stack is not empty 
    // and till root is Null 
    while (A != null || st.size() != 0)  
    { 
  
        // Check for null 
        if (A.right != null)  
        { 
            st.push(A.right); 
        } 
  
        // Make the Right Left and 
        // left null 
        A.right = A.left; 
        A.left = null; 
  
        // Check for null 
        if (A.right == null && st.size() != 0) 
        { 
            A.right = st.peek(); 
            st.pop(); 
        } 
  
        // Iterate 
        A = A.right; 
    } 
    return ans; 
} 
    
    public static void main(String[]args){
        ConvertTreeToLinkeslist b= new ConvertTreeToLinkeslist();
        
        for (int i = 0; i < 10; i++) {
            b.add(new Random().nextInt(10)+10);
        }
        System.out.println("Binary tree :");
        b.print();   
        b.solution();
        System.out.println("Linked list is :");
        b.print();
    }

}
