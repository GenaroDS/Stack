import java.util.Scanner; 
public class App {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner input = new Scanner(System.in); 
        System.out.println("Command:");
        System.out.println("1: Add to the stack.");
        System.out.println("2: To pop of the stack.");
        System.out.println("3: To check if the stack is empty.");
        System.out.println("4: To see the stack.");
        System.out.println("5: To quit.");
        System.out.println("Values 2, 5, 6, 1 has been added to the stack.");
        stack.push(2);
        stack.push(5);
        stack.push(6);
        stack.push(1);
        stack.show();

        while (true){
            System.out.println("Command:");
            String command = input.nextLine();
            if (command.equals("1")){
                System.out.println("Value to add:");
                int valor = Integer.valueOf(input.nextLine());
                stack.push(valor);
                stack.show();
            }
            
            if  (command.equals("2")){
                stack.pop();
                stack.show();
            }
            if (command.equals("3")){
                stack.check();
            }
            if (command.equals("4")){
                stack.show();
            }

            if (command.equals("5")){
                break;
            }
        } 
        input.close();
    }
}

