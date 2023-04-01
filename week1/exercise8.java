public class exercise8 {
    public double mm2feet(double m){
        return m/304.8;
    }
    public double m2inch(double m){
        return m/0.0254;
    }
    public double km2yard(double m){
        return m/0.0009144;
    }
    public void io(){
        menu();
        Input in = new Input();
        System.out.print("Enter your choice:");
        int c = in.nextInt();
        if (c == 4){
            return;
        }
        System.out.print("Enter your value:");
        int v = in.nextInt();
        if (c == 1){
            System.out.println(mm2feet(v));
        }
        if (c == 2){
            System.out.println(m2inch(v));
        }
        if (c == 3){
            System.out.println(km2yard(v));
        }
        io();

    }
    public void menu(){
        System.out.println("Menu:");
        System.out.println("1. Convert millimetres to feet.");
        System.out.println("2. Convert metres to inches.");
        System.out.println("3. Convert kilometres to yards.");
        System.out.println("4. Quit.");
    }
    public static void main(String[] args){
        new exercise8().io();
    }
}
