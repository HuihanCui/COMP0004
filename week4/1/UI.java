import java.util.ArrayList;

public class UI {
    private AddressBook book = new AddressBook();
    private void menu(){
        System.out.println("Welcome to the address book.");
        System.out.println("1. Add new entry.");
        System.out.println("2. Remove by name.");
        System.out.println("3. Search by name.");
        System.out.println("4. Get the whole book");
        System.out.println("5. quit.");
    }
    private void getWhole(){
        ArrayList<AddressBookEntry> adBook = book.getBook();
        if (adBook.isEmpty()){
            System.out.println("there is nothing in the book.");
        }
        for (AddressBookEntry e : adBook){
            System.out.println("Name: " + e.getName() + " Phone: " + e.getPhone() + " Email: " + e.getEmail());
        }
    }
    public void getInput(){
        Input in = new Input();
        menu();
        System.out.print("Enter your choice: ");
        String choice = in.nextLine();
        if (choice.equals("5")){
            return;
        }
        if (choice.equals("4")){
            getWhole();
        }
        if (choice.equals("1")){
            System.out.print("Enter the name: ");
            String name = in.nextLine();
            System.out.print("Enter the phone: ");
            String phone = in.nextLine();
            System.out.print("Enter the email: ");
            String email = in.nextLine();
            book.addEntry(name,phone,email);
        }
        if (choice.equals("2")){
            System.out.print("Enter the name: ");
            String name = in.nextLine();
            book.removeEntry(name);
        }
        if (choice.equals("3")) {
            System.out.print("Enter the name: ");
            String name = in.nextLine();
            AddressBookEntry e = book.searchEntry(name);
            if (e != null) {
                System.out.println("Name: " + e.getName() + " Phone: " + e.getPhone() + " Email: " + e.getEmail());
            }
        }
        getInput();
    }
    public static void main(String[] args){
        new UI().getInput();
    }
}
