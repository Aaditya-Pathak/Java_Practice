/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresInJava;

/**
 *
 * @author aditya
 */
public class LinkedList {

    Node head;

    Node tail;
    int size=0;

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;

        }

        @Override
        public String toString() {
            return ""+ data;
        }

       

    }

    public void add(int value) {
        size++;
        
        if (head == null) {
            head = new Node(value);
            tail = head;
        } else {
            tail.next = new Node(value);
            tail = tail.next;
        }

    }

    public void displyAll() {
        Node currNode = head;

        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;

        }

    }

    public void insert(int value, int pos) {
        if(pos<size+1){
        Node temp = head, temp1 = head;
        int trigger = 0;
        while (trigger != pos) {
            temp = temp1;
            temp1 = temp1.next;
            trigger++;
        }
        Node n = new Node(value);
        if (trigger == 0) {
            n.next = head;
            head = n;
        } else if (temp1 == tail) {
            tail.next = n;
            tail = n;
            n.next = null;
        } else {
            temp.next = n;

            n.next = temp1;

        }
        System.out.println("\n"+value + " Inserted at position " + pos);
        }
        else{System.out.print("cannot insert");}
    }
    
    
    public void remove(int pos) {
        if((pos>0&&size!=0)||(pos<size&&size!=0)){
        Node temp=head,temp1=head;
        int trigger = 0;
        while (trigger != pos) {
            temp = temp1;
            temp1 = temp1.next;
            trigger++;
        }
        if (pos == 0) {
            head = head.next;
        } else if (temp1 == tail) {
            tail=temp;
            tail.next=null;
        }
        else{
            temp.next=temp1.next;
        }
        System.out.println("\n"+temp1.data+" is removed from positoin "+ pos);
        }
        else{System.out.println("cannot remove");}
    }

    public int get(int index) {

        int trigger = 0;
        int data = -1;
        Node currNode = head;

        while (currNode != null) {

            if (trigger == index) {
                data = currNode.data;
                break;
            }
            currNode = currNode.next;
            trigger++;
        }

        return data;
    }
    
    public void reverse(){
    
        Node current=head;
        Node prev=null;
        Node next=current.next;
        
        while (current!= null) {
            next=current.next;
            current.next=prev;
            prev=current;
            
            current=next;
            
            

        }
      
        head = prev;

    
    }
    
    

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i = 1; i <=20; i++) {
            linkedList.add(i);
        }
        
        linkedList.reverse();
        linkedList.displyAll();
        
//
//        linkedList.displyAll();
       long temp =System.currentTimeMillis();
        linkedList.insert(10,17);
        System.out.println("Time "+(System.currentTimeMillis()-temp));
//        linkedList.displyAll();
        linkedList.remove(3);
        linkedList.displyAll();
        System.out.println("THe value as pos "+4+" is "+linkedList.get(4));
    }

}
