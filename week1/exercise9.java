public class exercise9 {
    long n = 0;
    public void getInput(){
        Input in = new Input();
        System.out.print("Enter a long:");
        n = in.nextLong();
    }
    public long reverse(){
        long copy = n;
        long reverse = 0;
        while (copy > 0){
            reverse *= 10;
            reverse += copy%10;
            copy /= 10;
        }
        return reverse;
    }
    public boolean check(long r){
        return r==n;
    }
    public static void main(String[] args){
        exercise9 e = new exercise9();
        e.getInput();
        if (e.check(e.reverse())){
            System.out.print("This is a palindrome");
        }
        else{
            System.out.print("This is not a palindrome");
        }
    }
}
