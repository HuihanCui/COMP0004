public class exercise6 {
    double first = 0;
    double second = 0;
    private double getDouble(){
        Input in = new Input();
        System.out.print("Type in a double:");
        return in.nextDouble();
    }
    private double squareRoot(){
        return Math.sqrt(first+second);
    }
    public void integrate(){
        first = getDouble();
        second = getDouble();
        System.out.print(squareRoot());
    }
    public static void main(String[] args){
        new exercise6().integrate();
    }
}
