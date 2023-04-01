public class exercise7 {
    int n = 0;
    int b = 0;
    public void getN(){
        Input in = new Input();
        System.out.print("type in an integer:");
        n = in.nextInt();
        System.out.print("type in the base:");
        b = in.nextInt();
    }
    public String StringtoBase(int n, int b){
        return Integer.toString(n,b);
    }
    public static void main(String[] args){
        exercise7 e = new exercise7();
        e.getN();
        System.out.print(e.StringtoBase(e.n,e.b));
    }

}
