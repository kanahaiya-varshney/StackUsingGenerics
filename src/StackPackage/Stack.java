package StackPackage;

public class Stack<T> {
    T ob[];
    int tos;
    int nElements;
    public Stack( T []array){
        ob=array;
        tos = -1;
        nElements=0;
    }
    public void push(T data){
        if(tos==ob.length-1){
            System.out.println("Stack is full");
        }
        else{
            tos++;
            ob[tos]=data;
            nElements++;
        }
    }
    public void  pop(){
        if(tos == -1){
            System.out.println("No data to delete");
        }
        else{
            nElements--;
            System.out.println(ob[tos--]);
        }
    }
    public void peek(){
        if(tos!=-1){
            System.out.println(ob[tos]);
        }
        else
            System.out.println("No data");
    }
    public boolean isEmpty(){
        return tos==-1;
    }
    public boolean isFull(){
        return tos== ob.length-1;
    }
    public void display(){
        System.out.println("---------------------");
        for(int i=tos;i>=0;i--){
            System.out.println(ob[i]);
        }
        System.out.println("---------------------");
    }
}
