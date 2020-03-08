package DataStructuresInJava;

import java.util.ArrayList;
import java.util.List;

public class LeastCommonAncestor {

    private class Node {

        Node left, right;
        int data;

        Node(int value) {
            data = value;
            left = null;
            right = null;
        }
    }

    private Node root;
    private List<Integer> path1 = new ArrayList<>();
    private List<Integer> path2 = new ArrayList<>();

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

    private void print() {
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

    public int lca(int a, int b) {
        path1.clear();
        path2.clear();
        return findlcs(root, a, b);
    }

    public int findlcs(Node root, int a, int b) {
        if (!findpath(root, a, path1) || !findpath(root, b, path2)) {
            System.out.println((path1.size() > 0) ? "n1 is present" : "n1 is missing");
            System.out.println((path2.size() > 0) ? "n2 is present" : "n2 is missing");
            return -1;
        }
        else{
            int i;
            findpath(root,a,path1);
            findpath(root,b,path2);
            for(i=0;i<path1.size()&&i<path2.size();i++){
                if(!path1.get(i).equals(path2.get(i))){
                    break;
                }
            }
            if(i!=0)
                return path1.get(i-1);
            else
                System.out.println("No LCA found !!");
            return 0;
        }
    }
    
    public boolean findpath(Node root,int num,List<Integer> path){
        if(root==null)
            return false;
        path.add(root.data);
        if(root.data==num)
            return true;
        if(root.left!=null&&findpath(root.left,num,path))
            return true;
        if(root.right!=null&&findpath(root.right,num,path))
            return true;
        path.remove(path.size()-1);
        return false;
    }

    public static void main(String[] args) {
        LeastCommonAncestor b = new LeastCommonAncestor();
        b.add(10);
        b.add(2);
        b.add(3);
        b.add(5);
        b.add(4);
        b.add(8);
        b.add(6);
        b.add(9);
        b.add(14);
        b.add(17);
        b.add(12);
        b.add(13);
        b.print();
        System.out.println("LCA of 12 & 17 : " + b.lca(12,17));
    }
}
