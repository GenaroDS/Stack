import java.util.Scanner; 
public class App {
    public static void main(String[] args) {
        Pile pile = new Pile();
        Scanner input = new Scanner(System.in); 
        System.out.println("Command:");
        System.out.println("1: Add to the pile.");
        System.out.println("2: To pop of the pile.");
        System.out.println("3: To check if the pile is empty.");
        System.out.println("4: To see the pile.");
        System.out.println("5: To quit.");
        while (true){
            System.out.println("Command:");
            String command = input.nextLine();
            if (command.equals("1")){
                System.out.println("Value to add:");
                int valor = Integer.valueOf(input.nextLine());
                pile.push(valor);
            }
            

            if  (command.equals("2")){
                pile.pop();
            }
            if (command.equals("3")){
                pile.check();
            }
            if (command.equals("4")){
                pile.show();
            }

            if (command.equals("5")){
                break;
            }
        } 
        input.close();
    }
}
