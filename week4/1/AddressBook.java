import java.util.ArrayList;

public class AddressBook {
    private ArrayList<AddressBookEntry> book = new ArrayList<>();
    public void addEntry(String name, String phone, String email){
        book.add(new AddressBookEntry(name, phone, email));
    }
    public void removeEntry(String name){
        for (AddressBookEntry e : book){
            if (e.getName().equals(name)){
                book.remove(e);
                return;
            }
        }
    }
    public AddressBookEntry searchEntry(String name){
        for (AddressBookEntry e : book){
            if (e.getName().equals(name)){
                return e;
            }
        }
        return null;
    }
    public ArrayList<AddressBookEntry> getBook(){
        return new ArrayList<AddressBookEntry>(book);
    }
}
