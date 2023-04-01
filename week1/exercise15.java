public class exercise15 {
    int start = 0;
    int end = 0;
    int product = 1;
    public void getInput() {
        Input in = new Input();
        System.out.print("Type the start integer value (smaller value):");
        start = in.nextInt();
        System.out.print("Type the end integer value (bigger value):");
        end = in.nextInt();
    }
    public void calculate(int n){
        if (n<=end){
            product *= n;
            calculate(n+1);
        }
    }
    public static void main(String[] args){
        exercise15 e = new exercise15();
        e.getInput();
        e.calculate(e.start);
        System.out.print("The result is " + e.product);
    }
}
