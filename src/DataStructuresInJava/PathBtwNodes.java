/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author aditya
 */
public class PathBtwNodes {

//    public class Node {
//
//        Node left, right;
//        int data;
//
//        Node(int value) {
//            data = value;
//            right = null;
//            left = null;
//        }
//    }
//    Node root;
//    private List<Integer> path1 = new ArrayList<>();
//    private List<Integer> path2 = new ArrayList<>();
//
//    private void print() {
//        printdata(root);
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
//    public void add(int value) {
//
//        if (root == null) {
//            root = new Node(value);
//        } else {
//            insert(root, value);
//        }
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
//    public void findpath(int n1, int n2) {
//        List<Integer> path = new ArrayList<>();
//        getpath1(root, n1, path1);
//        getpath1(root, n2, path2);
//        int intersection = -1;
//
//         Get intersection point  
//        int i = 0, j = 0;
//        while (i != path1.size() || j != path2.size()) {
//
//             Keep moving forward until no intersection  
//             is found  
//            if (i == j && path1.get(i) == path2.get(i)) {
//                i++;
//                j++;
//            } else {
//                intersection = j - 1;
//                break;
//            }
//        }
//
//         Print the required path  
//        for (i = path1.size() - 1; i > intersection; i--) {
//            System.out.print(path1.get(i) + " ");
//        }
//
//        for (i = intersection; i < path2.size(); i++) {
//            System.out.print(path2.get(i) + " ");
//        }
//    }
//
//    public boolean getpath1(Node root, int num, List<Integer> path) {
//        if (root == null) {
//            return false;
//        }
//        path.add(root.data);
//        if (root.data == num) {
//            return true;
//        }
//        if (getpath1(root.left, num, path) || getpath1(root.right, num, path)) {
//            return true;
//        }
//
//        path.remove(path.size() - 1);
//        return false;
//    }
//
//    boolean getPath(Node root, Vector<Integer> arr, int x)  
//{  
//    // if root is null  
//    // there is no path  
//    if (root==null)  
//        return false;  
//  
//    // push the node's value in 'arr'  
//    arr.add(root.data);  
//  
//    // if it is the required node  
//    // return true  
//    if (root.data == x)  
//        return true;  
//  
//    // else check whether the required node lies  
//    // in the left subtree or right subtree of  
//    // the current node  
//    if (getPath(root.left, arr, x) || getPath(root.right, arr, x))  
//        return true;  
//  
//    // required node does not lie either in the  
//    // left or right subtree of the current node  
//    // Thus, remove current node's value from  
//    // 'arr'and then return false  
//    arr.remove(arr.size()-1);  
//    return false;  
//}  
//    
//    void printPathBetweenNodes(Node root, int n1, int n2)  
//{  
//    // vector to store the path of  
//    // first node n1 from root  
//    Vector<Integer> path1= new Vector<Integer>();  
//  
//    // vector to store the path of  
//    // second node n2 from root  
//    Vector<Integer> path2=new Vector<Integer>();  
//  
//    getPath(root, path1, n1);  
//    getPath(root, path2, n2);  
//  
//    int intersection = -1;  
//  
//    // Get intersection point  
//    int i = 0, j = 0;  
//    while (i != path1.size() || j != path2.size()) {  
//  
//        // Keep moving forward until no intersection  
//        // is found  
//        if (i == j && path1.get(i) == path2.get(i)) {  
//            i++;  
//            j++;  
//        }  
//        else {  
//            intersection = j - 1;  
//            break;  
//        }  
//    }  
//  
//    // Print the required path  
//    for ( i = path1.size() - 1; i > intersection; i--)  
//        System.out.print( path1.get(i) + " "); 
//  
//    for ( i = intersection; i < path2.size(); i++)  
//        System.out.print( path2.get(i) + " ");  
//}  
//    public void printpath(List<Integer> path) {
//        for (int i = 0; i < path.size(); i++) {
//            System.out.println(path.get(i) + " ");
//        }
//    }
//
//    public static void main(String[] args) {
//        PathBtwNodes b = new PathBtwNodes();
//        b.add(10);
//        b.add(2);
//        b.add(3);
//        b.add(5);
//        b.add(4);
//        b.add(8);
//        b.add(6);
//        b.add(9);
//        b.add(14);
//        b.add(17);
//        b.add(12);
//        b.add(13);
//        b.print();
//        b.findpath(1, 20);
//    }

static class Node {  
    int data;  
    Node left, right;  
}  

 static Node getNode(int data)  
{  
     Node newNode = new Node();  
    newNode.data = data;  
    newNode.left = newNode.right = null;  
    return newNode;  
}  
  

static boolean getPath(Node root, Vector<Integer> arr, int x)  
{  

    if (root==null)  
        return false;  
   
    arr.add(root.data);  
  
    if (root.data == x)  
        return true;  
   
    if (getPath(root.left, arr, x) || getPath(root.right, arr, x))  
        return true;  
  
    arr.remove(arr.size()-1);  
    return false;  
}  
  

static void printPathBetweenNodes(Node root, int n1, int n2)  
{  

    Vector<Integer> path1= new Vector<Integer>();  
    Vector<Integer> path2=new Vector<Integer>();  
  
    getPath(root, path1, n1);  
    getPath(root, path2, n2);  
  
    int intersection = -1;  
  
    int i = 0, j = 0;  
    while (i != path1.size() || j != path2.size()) {  
  
        if (i == j && path1.get(i) == path2.get(i)) {  
            i++;  
            j++;  
        }  
        else {  
            intersection = j - 1;  
            break;  
        }  
    }  
    
    
    for ( i = path1.size() - 1; i > intersection; i--)  
        System.out.print( path1.get(i) + " "); 
  
    for ( i = intersection; i < path2.size(); i++)  
        System.out.print( path2.get(i) + " ");  
    
    
}  
  

public static void main(String[] args)  
{  
     Node root = getNode(0);  
    root.left = getNode(1);  
    root.left.left = getNode(3);  
    root.left.left.left = getNode(7);  
    root.left.right = getNode(4);  
    root.left.right.left = getNode(8);  
    root.left.right.right = getNode(9);  
    root.right = getNode(2);  
    root.right.left = getNode(5);  
    root.right.right = getNode(6);  
  
    int node1 = 6;  
    int node2 = 3;  
    printPathBetweenNodes(root, node1, node2);  
  
}

}
