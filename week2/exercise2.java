import java.util.Calendar;
import java.text.SimpleDateFormat;

public class exercise2 {
    int d = 0;
    int m = 0;
    int y = 0;
    public void getInput(){
        Input in = new Input();
        System.out.print("Enter the year: ");
        y = in.nextInt();
        System.out.print("Enter the month: ");
        m = in.nextInt();
        System.out.print("Enter the day: ");
        d = in.nextInt();
    }
    public void date(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, y);
        c.set(Calendar.MONTH, m-1);
        c.set(Calendar.DATE, d);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.print(format.format(c.getTime()));
    }
    public static void main(String[] args){
        exercise2 e = new exercise2();
        e.getInput();
        e.date();
    }
}
