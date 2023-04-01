import java.util.ArrayList;

public class exercise19 {
    ArrayList<Character> cs = new ArrayList<>();
    public boolean getInput(){
        FileInput fi = new FileInput("code.txt");
        while (fi.hasNextChar()) {
            if (!check(fi.nextChar())){
                fi.close();
                return false;
            }
        }
        if (cs.size() == 0){
            fi.close();
            return true;
        }
        fi.close();
        return false;
    }
    public boolean check(char c){
        if ((c == '(') || (c == '[') || (c == '{')){
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
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("the result is " + new exercise19().getInput());
    }
}
