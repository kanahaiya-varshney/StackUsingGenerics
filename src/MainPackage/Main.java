package MainPackage;

import StackPackage.Stack;

public class Main {
    public static void main(String[] args) {
       Double []ob=new Double[5];
       Integer []iob=new Integer[5];
       Stack<Integer> iobj=new Stack<>(iob);
       Stack<Double> obj=new Stack<>(ob);
        obj.push(1.1);
        obj.push(1.2);
        obj.push(1.3);
        obj.push(1.4);
        obj.push(1.5);
        obj.push(1.6);
        obj.pop();
        obj.display();
        iobj.push(1);
        

    }
}
