public class exercise10 {
    String s = "";
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
    private void getInput(){
        Input in = new Input ();
        System.out.print("Enter text to check: ");
        s = in.nextLine();
    }
    private void tidyString(){
        s = s.replaceAll("\\p{P}", "");
        s = s.replaceAll(" ","").toLowerCase();
    }
    public static void main(final String[] args){
        exercise10 e = new exercise10();
        e.getInput();
        e.tidyString();
        if (e.s.compareTo(e.reverse(e.s)) == 0){
            System.out.print("This is a palindrome");
        }
        else{
            System.out.print("This is not a palindrome");
        }
    }
}
