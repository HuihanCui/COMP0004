import java.util.ArrayList;

public class TemperatureTable {
    private ArrayList<String> tTable = new ArrayList<>();
    private int lower;
    private int upper;
    private int n;
    private String header = "Temperature Conversion";
    private String ch1 = "C";
    private String ch2 = "F";
    private int s = 4;
    public TemperatureTable(int lower, int upper, int n){
        this.lower = lower;
        this.upper = upper;
        this.n = n;
    }
    public void changeSet(String h, String c1, String c2, int space){
        this.header = h;
        this.ch1 = c1;
        this.ch2 = c2;
        this.s = space;
    }
    private int cTof(int c){
        return c * 9 / 5 + 32;
    }
    private void generate1(){
        int width = 8 * n + s * (n-1);
        int f = (width - header.length())/2;
        String str = "";
        for (int i=0; i<f; i++){
            str += " ";
        }
        tTable.add(str + header);
        for (int i=0; i<header.length(); i++){
            str += "-";
        }
        tTable.add(str);
        String str2 = "";
        String labels = ch1;
        for (int i=0; i < 4 - ch1.length(); i++){
            labels += " ";
        }
        labels += ch2;
        for (int i=0; i < 4 - ch2.length(); i++){
            labels += " ";
        }
        for (int i=0; i < s; i++){
            labels += " ";
        }
        for (int i=0; i < n; i++){
            str2 += labels;
        }
        tTable.add(str2);
    }
    private void split(){
        int start = lower;
        while (start + n - 1 < upper){
            generate2(start, start + n - 1);
            start += n;
        }
        generate2(start, upper);
    }
    private void generate2(int start, int end){
        String str = "";
        while (start <= end){
            String c = String.valueOf(start);
            str += c;
            for (int i=0; i<4 - c.length(); i++){
                str += " ";
            }
            String f = String.valueOf(cTof(start));
            str += f;
            for (int i=0; i<4 - f.length(); i++){
                str += " ";
            }
            for (int i=0; i<s; i++){
                str += " ";
            }
            start ++;
        }
        tTable.add(str);
    }
    public void generateTable(){
        generate1();
        split();
    }
    public ArrayList<String> getTable(){
        return new ArrayList<String>(tTable);
    }
}
