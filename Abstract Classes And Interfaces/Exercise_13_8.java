class Exercise_13_8 {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        //Create stack
        MyStack stack1 = new MyStack();
    
        //push object
        System.out.println("Pushing the number 4, 5 and 6 to 1st stack...");
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);

        //clone stack1 and assign the clone to stack2
        System.out.println("\nCloning 1st statck.....");
        MyStack stack2 = (MyStack)stack1.clone();

        //poping from stack1
        System.out.println("\nPoping object from stack1....");
        stack1.pop();

        System.out.println("\n1st " + stack1);
        System.out.println("\n2nd " + stack2);
        System.out.println("Is the 1st stack equal to yhe 2nd? " +(stack1 == stack2));
    }    
}
