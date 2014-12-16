/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 * This is a stack implemented with array
 * Max size is 100
 * @author Hala Mohamed
 */
public class Array implements StackInterface{
    private static final int Size=100;
    private int arr[]=new int[Array.Size];
    private int top=0;
    /**
     * construct Array
     */
    Array() {}
    /**
     * 
     * @see #top
     * @see #pop
     * Insert new item to stack
     * @param x is integer to insert in stack
     */
    public void push(int x){
        if(this.top < Array.Size){
                this.arr[top]=x;
                this.top++;
        }
    }
    /**
     * Remove the last item inserted from the stack. 
     */
    public void pop(){
        if (this.top>0){
                this.top--;
        }
    }
    
    /**
     * @return integer the last inserted item
     */
    public int top(){
        if(this.top > 0){
            return arr[this.top-1];
        }else
            return -1;
    }
    /**
     * Test if the stack is empty.
     * @return true if empty, false otherwise
     */
    public boolean isEmpty(){
        if(this.top<=0){
            return true;
        }else{
            return false;
        }
    }
    /** 
     * @return array of integer to show the content of stack 
     */
    public int[] show(){
        int arr[] = new int[size()] , i = 0;
        int temp = this.top;
        while(this.top>0){
            arr[i++] = this.top();
            this.top--;
        }
        this.top = temp;
        return arr;
    }
    /** 
     * @return size of stack 
     */
    public int size(){
        return this.top;
    }

}