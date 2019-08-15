
import java.util.Scanner;



public class UserInterface {

    private Phonebook phonebook = new Phonebook();
    
    
    
    
    public void start(Scanner scanner) {
    
        while(true) {
            System.out.print("\ncommand: ");
            String command = scanner.nextLine();
            if(command.equals("x")) break;
            
            if(Integer.parseInt(command)==1) {
                System.out.print("whose number: ");
                String name = scanner.nextLine();
                System.out.print("number: ");
                String number = scanner.nextLine();
                phonebook.add(name,number);
            }
            
            if(Integer.parseInt(command)==2) {
                System.out.print("whose number: ");
                String name = scanner.nextLine();
                phonebook.getNumbers(name);
            }
            
            if(Integer.parseInt(command)==3) {
                System.out.print("number: ");
                String number = scanner.nextLine();
                phonebook.getPerson(number);
            }
            
            if(Integer.parseInt(command)==4) {
                System.out.print("whose address: ");
                String name = scanner.nextLine();
                System.out.print("street: ");
                String street = scanner.nextLine();
                System.out.print("city: ");
                String city = scanner.nextLine();
                phonebook.addAddress(name,street + " " + city);
            }
            
            if(Integer.parseInt(command)==5) {
                System.out.print("whose information: ");
                String name = scanner.nextLine();
                phonebook.getInfo(name);
            }
            
            if(Integer.parseInt(command)==6) {
                System.out.print("whose information: ");
                String name = scanner.nextLine();
                phonebook.delete(name);
            }
            
            if(Integer.parseInt(command)==7) {
                System.out.print("keyword (if empty, all listed): ");
                String keyword = scanner.nextLine();
                if(keyword.isEmpty()) phonebook.printAll();
                else phonebook.search(keyword);
            }
        
        }
    
    }
    
    }
