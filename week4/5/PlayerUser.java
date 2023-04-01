public class PlayerUser {
    private int score;
    private int dices;
    public PlayerUser(int score, int dices){
        this.score = score;
        this.dices = dices;
    }
    public String choice(){
        Input in = new Input();
        System.out.print("Enter your choice, Y for continue shaking, N for stopping: ");
        return in.nextLine();
    }
}
