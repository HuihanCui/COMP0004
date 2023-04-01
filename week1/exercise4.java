import java.util.Random;

public class exercise4 {
    public double getRandom(){
        Random random = new Random();
        double d = random.nextDouble();
        if (random.nextBoolean()){
            return d;
        }
        return -d;
    }
    public void regulate(){
        double max = -1;
        double min = 1;
        double sum = 0;
        for (int i=0; i<10000; i++){
            double d = getRandom();
            if (d > max){
                max = d;
            }
            if (d < min){
                min = d;
            }
            sum += d;
        }
        double average = sum/10000;
        System.out.println("the max is " + max);
        System.out.println("the min is " + min);
        System.out.println("the average is " + average);
    }
    public static void main(String[] args){
        new exercise4().regulate();
    }
}
