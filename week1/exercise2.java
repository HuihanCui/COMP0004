import java.util.ArrayList;

public class exercise2 {
    private static ArrayList<Double> numbers = new ArrayList<>();
    public void takeInput(){
        Input in = new Input();
        for (int i=1; i<11; i++){
            System.out.print("input 10 doubles " + i + ":");
            double n = in.nextDouble();
            numbers.add(n);
        }
    }
    public void average(ArrayList array){
        double sum = 0;
        for (int i=0; i<10; i++){
            sum += numbers.get(i);
        }
        System.out.print("the average is " + sum/array.size());
    }
    public static void main(String[] args){
        exercise2 e =  new exercise2();
        e.takeInput();
        e.average(numbers);
    }
}
