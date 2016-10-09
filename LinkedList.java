package com.jd.practice;

public class LinkedList {

    private Node head;
    
    private class Node{
        int data;
        Node prev;
        Node next;

        public Node(int d, Node p, Node n){
            this.data = d;
            this.prev = p;
            this.next = n;
        }
    }

}
