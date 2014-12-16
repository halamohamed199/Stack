/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *this is stack implemented with linked list
 * @author Hala Mohamed
 */
public class LinkedList implements StackInterface {
    private int Size=0;
    Node head;

    /**
     * This is class to create node have a value 
     * it create pointer to refer the next node
     */
    class Node{
        private int value;
        private Node next;
        /**
         * constructors
         */
        Node(){
            value=0;
            next=null;
        }
        Node(int v,Node c){
            value=v;
            next=c;
        }
    }
    /**
     * construct linked list
     */
    public LinkedList (){}
    /**
     * @see #top
     * @see #pop
     * Insert new item to stack
     * @param x is integer to insert to stack
    */
    public void push(int x){
	Size++;
	Node temp=new Node(x, null);
	if(head==null){
            head=temp;
	}else{
            temp.next=head;
            head=temp;
	}
    }
    /**
     * Remove the last item inserted from the stack.
     */
    public void pop(){
        Size--;
	Node temp=head;
	head=temp.next;
	temp.next=null;
	temp=null;
    }
    /**
     * @return integer the last inserted item 
     */
    public int top(){
	return head.value;
    }
    /**
     * Test if the stack is empty.
     * @return true if empty, false otherwise
     */
    public boolean isEmpty(){
	if(Size==0) return true;
	else return false;
    }
    /** 
     * @return array of integer to show the content of stack 
     */
    public int[] show(){
	Node temp=head;
	int arr[] = new int[size()] , i = 0;
        while(temp!=null){
            arr[i++] = temp.value;
            temp=temp.next;
	}
        return arr;
    }
    /** 
     * @return size of stack 
     */
    public int size(){
	return Size;
    }
		
}


