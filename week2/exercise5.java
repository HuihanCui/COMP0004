import java.util.HashMap;

public class exercise5 {
    private HashMap<String, String> d = new HashMap<>();
    public void getD(){
        FileInput fi = new FileInput("dictionary.txt");
        while (fi.hasNextLine()){
            d.put(fi.nextLine(), fi.nextLine());
        }
        fi.close();
    }
    public void putD(){
        FileOutput fo = new FileOutput("dictionary.txt", false);
        for (String w : d.keySet()){
            fo.writeString(w + "\n");
            fo.writeString(d.get(w) + "\n");
        }
        fo.close();
    }
    public void lookUp(String s){
        if (d.containsKey(s)){
            System.out.println(d.get(s));
        }
        else {
            System.out.println("There is no such word.");
        }
    }
    public void add(String w, String m){
        d.put(w,m);
    }
    public void menu(){
        System.out.println("Welcome to the dictionary:");
        System.out.println("1.lookup the meaning of the word");
        System.out.println("2.add word and its meaning to the dictionary");
        System.out.println("3.quit");
    }
    public void user(){
        Input in = new Input();
        menu();
        System.out.print("Enter your choice: ");
        String choice = in.nextLine();
        if (choice.equals("3")){
            return;
        }
        if (choice.equals("1")){
            System.out.print("Enter your word:");
            lookUp(in.nextLine());
        }
        else{
            System.out.print("Enter your word:");
            String w = in.nextLine();
            System.out.print("Enter your meaning:");
            add(w, in.nextLine());
        }
        user();
    }
    public static void main(String[] args){
        exercise5 e = new exercise5();
        e.getD();
        e.user();
        e.putD();
    }
}
