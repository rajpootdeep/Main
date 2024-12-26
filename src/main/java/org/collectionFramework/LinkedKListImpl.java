package org.collectionFramework;

public class LinkedKListImpl<T> {

    Node head;

    static class Node<T>{
        T data;
        Node next;
        Node(T d){
            data=d;
            next=null;
        }

    }
    LinkedKListImpl(){
        head=null;
    }



    public void add(T a){
        Node temp=null;
        if (this.head==null){
            head=new Node(a);
        }else {
            temp=this.head;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next=new Node<>(a);
        }
    }

    public int size(){
        Node temp=this.head;
        int n=0;
        while (temp.next != null){
            temp=temp.next;
            ++n;
        }
        return n;
    }

    public static void main(String[] args) {
        LinkedKListImpl<Integer> l=new LinkedKListImpl<>();
        l.add(2);
        l.add(6);
        l.add(6);
        System.out.println(l.size());


    }

}
