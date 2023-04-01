import java.math.BigDecimal;

public class exercise3 {
    long n = 0;
    public void getInput(){
        Input in = new Input();
        System.out.print("Enter the value:");
        n = in.nextLong();
    }
    public void calculate(){
        BigDecimal product = new BigDecimal("1");
        for (int i = 2; i<= n; i++){
            product = product.multiply(BigDecimal.valueOf(i));
        }
        System.out.println(product);
        System.out.println(product.toString().length());
    }
    public static void main(String[] args){
        exercise3 e = new exercise3();
        e.getInput();
        e.calculate();
    }
}
