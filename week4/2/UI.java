
import java.util.ArrayList;

public class UI {
    private Range range;
    private void menu(){
        System.out.println("Welcome to the range app.");
        System.out.println("1. Get lower and upper bound for the range.");
        System.out.println("2. Determine whether a number is in the range.");
        System.out.println("3. Get all values in the range in order.");
        System.out.println("4. quit.");
    }
    public void init(){
        Input in = new Input();
        System.out.print("Enter the lower bound: ");
        String l = in.nextLine();
        System.out.print("Enter the upper bound: ");
        String u = in.nextLine();
        range = new Range(Integer.valueOf(l), Integer.valueOf(u));
        if (Integer.valueOf(l) > Integer.valueOf(u)){
            System.out.println("Lower bound should be smaller, please enter again.");
            init();
        }
    }
    public void getInput(){
        menu();
        System.out.print("Enter your choice: ");
        Input in = new Input();
        String choice = in.nextLine();
        if (choice.equals("4")){
            return;
        }
        if (choice.equals("1")){
            System.out.println("The lower bound is " + range.getLower() + ", and the upper bound is "+ range.getUpper());
        }
        if (choice.equals("2")){
            System.out.print("Enter your number: ");
            String n = in.nextLine();
            System.out.println("The result is " + range.contains(Integer.valueOf(n)));
        }
        if (choice.equals("3")){
            ArrayList<Integer> arr = range.getValues();
            for (int r : arr){
                System.out.println(r);
            }
        }
        getInput();
    }
    public static void main(String[] args){
        UI ui = new UI();
        ui.init();
        ui.getInput();
    }
}
