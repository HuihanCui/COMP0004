public class exercise17 {
    public long getInput(){
        Input in = new Input();
        System.out.print("type in your number:");
        return in.nextLong();
    }
    public boolean prime(long n){
        if (n % 2 == 0){
            return false;
        }
        for (int i=3; i<Math.sqrt(n);i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        exercise17 e = new exercise17();
        System.out.print("the result is " + e.prime(e.getInput()));
    }
}
