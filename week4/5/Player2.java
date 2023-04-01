public class Player2 {
    private int score;
    private int dices;
    public Player2(int score, int dices){
        this.score = score;
        this.dices = dices;
    }
    public String choice(){
        if (score > 799){
            return "N";
        }
        return "Y";
    }
}
