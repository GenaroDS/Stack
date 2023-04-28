public class Stack {
    private int[] stack;
    private int top;
    public Stack(){
        this.stack = new int[5];
        this.top = 0;
    }
    public void push(int toAdd) {
        if (this.top < 5) { 
            this.stack[top] = toAdd; 
            top++; 
        } else {
            System.out.println("The stack is full.");
        }
    }
    public void pop() {
        if (this.top > 0) {
            this.top--;
            System.out.println("Top of stack poped!");
        } else {
            System.out.println("The stack is empty."); 
        }
    }
    public void check() {
        if (this.top == 0) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack isn't empty.");
        }
    }
    public void show(){
        int index = this.top-1;
        System.out.println("This is what the stack looks like:");
        if (this.top == 0){
            System.out.println("Empty.");
        }
        while (index >= 0){
            System.out.println("-"+stack[index]+"-");
            System.out.println("---");
            index--;
        }
    }
}
