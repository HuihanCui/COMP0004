public class exercise13 {
    public void read(){
        FileInput fi = new FileInput("palindrome.txt");
        while (fi.hasNextLine()){
            String s = fi.nextLine();
            String sn = tidyString(s);
            if (sn.compareTo(reverse(sn)) == 0){
                output(s);
            }
        }
        fi.close();
    }
    private String tidyString(String s){
        s = s.replaceAll("\\p{P}", "");
        s = s.replaceAll(" ","").toLowerCase();
        return s;
    }
    private String reverse(final String s){
        String result = new String();
        int position = 0;
        while (position < s.length())
        {
            result = Character.toString(s.charAt(position)) + result;
            position = position + 1;
        }
        return result;
    }
    public void output(String s){
        FileOutput fo = new FileOutput("resultpalindrome.txt",true);
        fo.writeString(s + "\n");
        fo.close();
    }
    public static void main(String[] args){
        new exercise13().read();
    }
}
