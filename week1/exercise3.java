import java.util.ArrayList;
import java.util.Collections;

public class exercise3 {
    private static ArrayList<String> strs = new ArrayList<>();
    public void takeWords(){
        Input in = new Input();
        for (int i=1; i<11; i++){
            System.out.print("input 10 words " + i + ":");
            String n = in.nextLine();
            strs.add(n);
        }
    }
    public void reverse(){
        Collections.sort(strs);
        Collections.reverse(strs);
    }
    public void display(){
        for (String s : strs){
            System.out.print(s + " ");
        }
    }
    public static void main(String[] args){
        exercise3 e = new exercise3();
        e.takeWords();
        e.reverse();
        e.display();
    }
}
