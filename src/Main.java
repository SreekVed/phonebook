import java.util.Scanner;

 

public class Main {

 

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Phonebook");

        System.out.println("available operations:");

        System.out.println(" 1 add a number\n" +

" 2 search for a number\n" +

" 3 search for a person by phone number\n" +

" 4 add an address\n" +

" 5 search for personal information\n" +

" 6 delete personal information\n" +

" 7 filtered listing\n" +

" x quit");

        

        UserInterface ui = new UserInterface();

        ui.start(reader);

        

    }

}

 
