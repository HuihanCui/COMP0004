import java.util.ArrayList;

public class exercise17_2 {
    ArrayList<Long> primes = new ArrayList<>();
    public boolean isPrime(long n){
        for (long i : primes){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public void regulate(){
        for (long i=2; i<1000000; i++){
            if (isPrime(i)){
                primes.add(i);
            }
        }
    }
    public static void main(String[] args){
        exercise17_2 e = new exercise17_2();
        e.regulate();
        System.out.print(e.primes.size());
    }
}
