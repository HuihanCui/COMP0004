import java.util.ArrayList;

public class BracePair {
    ArrayList<Character> cs = new ArrayList<>();
    ArrayList<Integer> counts = new ArrayList<>();
    boolean result;
    int index = -1;
    int state = 0;
    public BracePair(String s){
        for (char c : s.toCharArray()){
            if (!preprocess(c)){
                result = false;
            }
        }
        if (cs.size() == 0){
            result = true;
        }
        else{
            result = false;
        }
    }
    public boolean check(char c){
        if ((c == '(') || (c == '[') || (c == '{')){
            if (cs.size() == 0){
                index ++;

                counts.add(index,0);
            }
            cs.add(c);
        }
        if (((c == ')') || (c == ']') || (c == '}')) && cs.isEmpty()){
            return false;
        }
        if (((c == ')') && (cs.get(cs.size()-1) != '(')) || ((c == ']') && (cs.get(cs.size()-1) != '[')) || ((c == '}') && (cs.get(cs.size()-1) != '{'))){
            return false;
        }
        if ((c == ')') || (c == ']') || (c == '}')){
            cs.remove(cs.size()-1);
            counts.set(index, counts.get(index) + 1);
        }
        return true;
    }
    public boolean preprocess(char c){
        //System.out.print(state);
        if ((c == '/') && (state == 0)){
            state = 1;  //遇到一个/
        }
        if ((c == '/') && (state == 1)){
            state = 2;  //遇到两个//
        }
        if ((c == '\n') && (state == 2)){
            state = 0;  //遇到两个//
        }
        if (c == '"'){
            if (state == 0){
                state =2;
            }
            else{
                state = 0;
            }
        }
        if (state != 2){
            return check(c);
        }
        else{
            return true;
        }
    }
}
