public class UI {
    private void basics(){
        Input in = new Input();
        System.out.println("Enter the start value: ");
        int s = in.nextInt();
        System.out.println("Enter the end value: ");
        int e = in.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = in.nextInt();
        TemperatureTable t = new TemperatureTable(s, e, n);
        t.generateTable();
        for (String str : t.getTable()) {
            System.out.println(str);
        }
    }
    public void getInput(){
        menu();
        Input in = new Input();
        System.out.print("Enter your choice: ");
        String choice = in.nextLine();
        if (choice.equals("1")) {
            basics();
        }
        if (choice.equals("2")){
            System.out.println("Enter the title: ");
            String h = in.nextLine();
            System.out.println("Enter the first label: ");
            String h1 = in.nextLine();
            System.out.println("Enter the second label: ");
            String h2 = in.nextLine();
            System.out.println("Enter the number of spaces between column: ");
            int space = in.nextInt();
            System.out.println("Enter the start value: ");
            int s = in.nextInt();
            System.out.println("Enter the end value: ");
            int e = in.nextInt();
            System.out.println("Enter the number of columns: ");
            int n = in.nextInt();
            TemperatureTable t = new TemperatureTable(s, e, n);
            t.changeSet(h, h1, h2, space);
            t.generateTable();
            for (String str : t.getTable()) {
                System.out.println(str);
            }
        }
    }
    private void menu(){
        System.out.println("Welcome to the temperature conversion table.");
        System.out.println("1. Start with default headers.");
        System.out.println("2. Define your own headers.");
    }
    public static void main(String[] args){
        UI ui = new UI();
        ui.getInput();
    }
}
