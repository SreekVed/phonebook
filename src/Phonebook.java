
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class Phonebook {

    private Map<String, Set<String>> phonebook = new HashMap<String,Set<String>>();
    private Map<String, String> addressbook = new HashMap<String,String>();
    
    
    public void add(String name, String number) {
        if(!this.phonebook.containsKey(name)) this.phonebook.put(name, new HashSet<String>());
        this.phonebook.get(name).add(number);
        
    }

    public void getNumbers(String name) {
        if(!this.phonebook.containsKey(name)) System.out.println("not found");
        else {
           for(String number : this.phonebook.get(name)) {
               System.out.println(number);
           }
        }    
    }

    public void getPerson(String number) {
        boolean found = false;
        for(String name : this.phonebook.keySet()) {
               
                for(String num : this.phonebook.get(name)) {
                    if(num.equals(number)) {System.out.println(name);
                    found=true;
                    }
                
                }
            
           }
        
        if(found==false) System.out.println("not found");
        
    }

    public void addAddress(String name, String address) {
        this.addressbook.put(name, address); 
    }

    public void getInfo(String name) {
        if(!this.addressbook.containsKey(name) && !this.phonebook.containsKey(name)) {System.out.println("not found");
        return;
        }
        if(!this.addressbook.containsKey(name)) System.out.println("address unknown");
        else System.out.print("address: " + this.addressbook.get(name));
        if(!this.phonebook.containsKey(name)) System.out.println("phone number not found");
        else {
            System.out.println("phone numbers: ");
            this.getNumbers(name);
        }
    }

    public void delete(String name) {
       this.phonebook.remove(name);
        this.addressbook.remove(name);
        
    }

    public void printAll() {
        for(String n : this.addressbook.keySet()) {
            this.getInfo(n);
        }
    }

    public void search(String keyword) {
        List<String> names = new ArrayList<String>();
        
         for(String name : this.addressbook.keySet()) {
               
             if(name.contains(keyword)) names.add(name);
             if(this.addressbook.get(name).contains(keyword)) names.add(name); 
           
         }
         
         for(String nombre : this.phonebook.keySet()) {
         
             if(nombre.contains(keyword)) names.add(nombre);
         }
         
         if(names.isEmpty()) System.out.println("keyword not found");
         else{
         Collections.sort(names);
         
            for(String name : names) {
                System.out.println(name);
                this.getInfo(name);
            }
         }
           }
        
        
}
