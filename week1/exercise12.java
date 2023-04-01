import java.util.ArrayList;
import java.util.Collections;

public class exercise12 {
    ArrayList<Character> s = new ArrayList<>();
    public void read(){
        FileInput fi = new FileInput("test2.txt");
        while (fi.hasNextChar()){
            s.add(fi.nextChar());
        }
        fi.close();
    }
    public void write(){
        FileOutput fo = new FileOutput("result.txt",true);
        Collections.reverse(s);
        for (char c : s){
            fo.writeChar(c);
        }
        fo.close();
    }
    public static void main(String[] args){
        exercise12 e = new exercise12();
        e.read();
        e.write();
    }
}
