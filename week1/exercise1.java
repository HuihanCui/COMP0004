public class exercise1 {
    public void takeInput(){
        Input in = new Input();
        System.out.print("Continue typing strings until stop: ");
        String input = in.nextLine();
        if (input.replaceAll(" ","").toLowerCase().compareTo("stop") != 0){
            takeInput();
        }
    }
    public static void main(String[] args){
        new exercise1().takeInput();
    }
}
