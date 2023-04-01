public class exercise1 {
    static int basic_count = 0;
    static int lines = 0;
    int state = 0;
    static int words = 0;
    public void getInput(){
        FileInput fi = new FileInput("1.txt");
        while (fi.hasNextChar()){
            count(fi.nextChar());
        }
        count('\n');
        fi.close();
    }
    public void count(char c){
        basic_count++;
        if (c == '\n'){
            lines++;
            basic_count--;
        }
        if (check(c) && state == 0){
            state = 1;
        }
        if (!check(c) && state == 1){
            state = 0;
            words ++;
        }
    }
    public boolean check(char c){
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
    public static void main(String[] args){
        exercise1 e = new exercise1();
        e.getInput();
        System.out.println("there are " + basic_count + " characters");
        System.out.println("there are " + lines + " lines");
        System.out.println("there are " + words + " words");
    }
}
