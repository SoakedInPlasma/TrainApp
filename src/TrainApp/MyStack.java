/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrainApp;

import java.util.*;
public class MyStack implements StackInterface {

    private ArrayList<String> theStack;

    /**
     * Create a new instance of Stack
     */
    public MyStack() {
        theStack = new ArrayList<String>();
    }

    public int size() {
        return theStack.size();

    }

    public boolean isEmpty() {
        return theStack.isEmpty();
    }

    /**
     * always false as there is no limit on the size of this ArrayList based
     * stack
     */
    public boolean isFull() {
        return false;
    }

    /**
     * removes the item from the top of the stack and returns it
     */
    public Object pop() {
        if (!(theStack.isEmpty())) {
            return theStack.remove(0);
        } else {
            return null;
        }
    }

    /**
     * puts an item onto the top of the stack
     */
    public void push(Object newItem) {
        theStack.add(0, (String) newItem);

    }

    // removes all elements from the stack
    public void emptyStack() {
        theStack.clear();
    }


    

    // return a String object that consists of all elements from the stack
    public String displayStack() {
        //add your code here
        String sResult="";
        for(int iCount = 0; iCount< theStack.size(); iCount++) {
            sResult+=theStack.get(iCount)+"\n";
        }
        return(sResult);
    }
}