public class exercise5 {
    public double getDouble(){
        Input in = new Input();
        System.out.print("Type in a double:");
        return in.nextDouble();
    }
    public double squareRoot(double a, double b){
        return Math.sqrt(a+b);
    }
    public static void main(String[] args){
        exercise5 e = new exercise5();
        System.out.print(e.squareRoot(e.getDouble(),e.getDouble()));
    }
}
