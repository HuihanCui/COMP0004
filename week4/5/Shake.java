import java.util.ArrayList;
import java.util.Random;

public class Shake {
    private int n;
    private ArrayList<Integer> dices = new ArrayList<>();
    public Shake(int n){
        this.n = n;
    }
    private void generate(){
        Random r = new Random();
        for (int i=0; i<n; i++){
            dices.add(r.nextInt(1,7));
        }
    }
    public ArrayList<Integer> getDices(){
        generate();
        return new ArrayList<Integer>(dices);
    }
}
