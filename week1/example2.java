public class example2 {
    private String getName(){
        Input in = new Input();
        System.out.print("Type a file name: ");
        String name = in.nextLine();
        return name;
    }
    private void printFile(String name){
        FileInput fileIn = new FileInput(name);
        while (fileIn.hasNextLine()){
            System.out.println(fileIn.nextLine());
        }
        fileIn.close();
    }
    public void together(){
        printFile(getName());
    }
    public static void main(String[] args){
        new example2().together();
    }
}
