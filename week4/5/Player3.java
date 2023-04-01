public class Player3 {
    private int score;
    private int dices;
    public Player3(int score, int dices){
        this.score = score;
        this.dices = dices;
    }
    public String choice(){
        if (dices > 1) {
            return "Y";
        }
        return "N";
    }
}
