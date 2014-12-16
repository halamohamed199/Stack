/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 * @author Hala Mohamed
 */
public interface StackInterface {
    /**
     * 
     * @param x integer to insert in stack
     */
    public void push(int x);
    /**
     * Remove the last item inserted from the stack.
     */
    public void pop();
    /**
     * 
     * @return integer the last inserted item
     */
    public int top();
    /**
     * Test if the stack is empty.
     * @return true if empty, false otherwise
     */
    public boolean isEmpty();
     /** 
     * @return array of integer to show the content of stack 
     */
    public int[] show();
    /** 
     * @return size of stack 
     */
    public int size();
    
    
}
