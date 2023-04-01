import java.util.ArrayList;
import java.util.HashMap;

public class Scorer {
    private HashMap<Integer, Integer> counter = new HashMap<>();
    private int score;
    private int length;
    private ArrayList<Integer> dices = new ArrayList<>();
    public Scorer(ArrayList<Integer> dices){
        this.dices = dices;
        this.length = dices.size();
    }
    private void init(){
        for (int i=1; i<7; i++){
            counter.put(i,0);
        }
        for (int dice: dices){
            int now = counter.get(dice);
            counter.put(dice, now + 1);
        }
    }
    private void sec(){
        init();
        for (int key : counter.keySet()){
            if (counter.get(key) >= 3){
                if (key == 1){
                    score += 1000;
                }
                else{
                    score += 100 * key;
                }
                counter.put(key,counter.get(key) - 3);
            }
        }
        score += counter.get(1) * 100;
        score += counter.get(5) *50;
        counter.put(1,0);
        counter.put(5,0);
    }
    public int notUsed(){
        int remain = 0;
        for (int i: counter.keySet()){
            remain += counter.get(i);
        }
        if (remain == 0){
            remain = length;
        }
        return remain;
    }
    public int getScore(){
        sec();
        return score;
    }
}
