public class exercise14 {
    String s = "";
    public void getInput(){
        Input in = new Input();
        System.out.print("Enter the string you want to put in middle:(maximum 80 characters)");
        s = in.nextLine();
    }
    public int calculate(){
        return (80-s.length())/2;
    }
    public void output(int n){
        for (int i=0; i<n; i++){
            System.out.print("*");
        }
        System.out.print(s);
        for (int i=n+s.length(); i<80; i++){
            System.out.print("*");
        }
    }
    public static void main(String[] args){
        exercise14 e = new exercise14();
        e.getInput();
        e.output(e.calculate());
    }
}
