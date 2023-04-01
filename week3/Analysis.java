import java.util.Collections;
import java.util.HashMap;

public class Analysis {
    HashMap<Integer, Integer> stat = new HashMap<>();
    public void getInput(){
        FileInput fi = new FileInput("test.txt");
        String s = "";
        while (fi.hasNextLine()){
            s = s + fi.nextLine() + "\n";
        }
        BracePair bp = new BracePair(s);
        System.out.println("The result is " + bp.result);
        if (bp.result){
            analyse(bp);
        }
        fi.close();
    }
    public void analyse(BracePair bp){
        System.out.println("The maximum depth is " + Collections.max(bp.counts));
        System.out.print("The depths are shown in sequence ");
        for (int i : bp.counts){
            System.out.print(i + " ");
            if (stat.containsKey(i)){
                stat.put(i, stat.get(i) + 1);
            }
            else {
                stat.put(i, 1);
            }
        }
        System.out.print("\n");
        for (int i : stat.keySet()){
            System.out.println("There are " + stat.get(i) + " pairs at depth " + i);
        }
    }
    public static void main(String[] args){
        Analysis a = new Analysis();
        a.getInput();
    }
}
