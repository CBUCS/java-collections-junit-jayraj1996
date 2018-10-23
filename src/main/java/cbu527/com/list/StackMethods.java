package cbu527.com.list;
import cbu527.com.list.LinkedListMethods.*;

public class StackMethods<T> implements ListInterface<T>{
    private int top,size;  //declaration of private variables
    private int maximumCapacityOfStack;


    @Override
    public ListNode remove(int index) {
        return null;
    }

    private T[] stack ; // Array declaration of type stack

    public StackMethods(){
        this.top = -1;    //set initial position of top to -1 because after adding fist element it's value increase by 1
        this.size = 0;
        this.maximumCapacityOfStack = 10;
        this.stack = (T[])new Object[maximumCapacityOfStack];
    }

    //add the elements in stack
    @Override
    public void addItem(T element) {
        if(this.size == this.maximumCapacityOfStack){ //check id size of stack is equal to maximum capacity os stack.
            System.out.println("Stack Overflow");
        }
        else{
            this.top = this.top + 1;
            this.size = this.size + 1;
            this.stack[top] = element;
        }
    }
    // print the element from the top of stack
    public void print(){
        for(int i = top ;i>=0;i--){
            System.out.print(this.stack[i]+"-->");
        }
    }

    @Override
    public int count() {
        int count = 1;
         for( int i=0; i<stack.length-1;i++){
             if(stack[i] != stack[i+1]){
                 count++;
             }
        }
        return count;
    }

    // delete the element from top.
    @Override
    public T delete() {
        if(this.size == 0){
            System.out.println("Stack is empty!!");
        }else{
            Object stack = this.stack[top];
            this.stack[top] = null;
            this.top = this.top-1;
            this.size = this.size-1;
        }
        return (T)stack;
    }

    @Override
    public void addItem(int item, int index) {

    }

}
