import java.util.ArrayList;

public class UI {
    public static void main(String[] args){
        Shake dices = new Shake(5);
        ArrayList<Integer> d = dices.getDices();
        for (int e : d){
            System.out.print(e);
        }
        System.out.println();
        Scorer s = new Scorer(d);
        System.out.println(s.getScore());
        System.out.println(s.notUsed());
    }
}
