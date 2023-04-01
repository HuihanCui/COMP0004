import java.util.HashMap;

public class exercise11 {
    HashMap <Character,Integer> hm = new HashMap<>();
    public void getChar(){
        FileInput f = new FileInput("Lanice.txt");
        while (f.hasNextChar()){
            count(f.nextChar());
        }
        f.close();
    }
    public void count(char c){
        Integer value = hm.get(c);
        if (value == null){
            hm.put(c,1);
        }
        else{
            value++;
            hm.put(c,value);
        }
    }
    public void output(){
        for (char c : hm.keySet()){
            Integer value = hm.get(c);
            System.out.println(c + ":" + value);
        }
    }
    public static void main(String[] args){
        exercise11 e = new exercise11();
        e.getChar();
        e.output();
    }
}
