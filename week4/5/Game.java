import java.util.ArrayList;

public class Game {
    private int[] scores = {0,0,0,0};
    int totalScore;
    private int winner;
    private void init(){
        System.out.println("Welcome to the game.");
    }
    private boolean max(){
        int index = 0;
        int max = 0;
        for (int i=0; i<4; i++){
            if (scores[i] > max){
                max = scores[i];
                index = i;
            }
        }
        if (max >= 5000){
            winner = index;
            return false;
        }
        return true;
    }
    private void p1(int n, int threshold){
        Shake dices = new Shake(n);
        ArrayList<Integer> d = dices.getDices();
        System.out.println("The dices are:");
        for (int e : d){
            System.out.print(e);
        }
        System.out.println();
        Scorer s = new Scorer(d);
        int s1 = s.getScore();
        totalScore += s1;
        System.out.println("The score is:");
        System.out.println(s1);
        if (s1 < threshold){
            return;
        }
        Player1 d1 = new Player1(totalScore, s.notUsed());
        System.out.println("the decision is " + d1.choice());
        if (d1.choice().equals("N")){
            scores[0] += totalScore;
        }
        else{
            p1(s.notUsed(), 1);
        }
    }
    private void p2(int n, int threshold){
        Shake dices = new Shake(n);
        ArrayList<Integer> d = dices.getDices();
        System.out.println("The dices are:");
        for (int e : d){
            System.out.print(e);
        }
        System.out.println();
        Scorer s = new Scorer(d);
        int s1 = s.getScore();
        totalScore += s1;
        System.out.println("The score is:");
        System.out.println(s1);
        if (s1 < threshold){
            return;
        }
        Player2 d1 = new Player2(totalScore, s.notUsed());
        System.out.println("the decision is " + d1.choice());
        if (d1.choice().equals("N")){
            scores[1] += totalScore;
        }
        else{
            p2(s.notUsed(), 1);
        }
    }
    private void p3(int n, int threshold){
        Shake dices = new Shake(n);
        ArrayList<Integer> d = dices.getDices();
        System.out.println("The dices are:");
        for (int e : d){
            System.out.print(e);
        }
        System.out.println();
        Scorer s = new Scorer(d);
        int s1 = s.getScore();
        totalScore += s1;
        System.out.println("The score is:");
        System.out.println(s1);
        if (s1 < threshold){
            return;
        }
        Player3 d1 = new Player3(totalScore, s.notUsed());
        System.out.println("the decision is " + d1.choice());
        if (d1.choice().equals("N")){
            scores[2] += totalScore;
        }
        else{
            p3(s.notUsed(), 1);
        }
    }
    private void p4(int n, int threshold){
        Shake dices = new Shake(n);
        ArrayList<Integer> d = dices.getDices();
        System.out.println("The dices are:");
        for (int e : d){
            System.out.print(e);
        }
        System.out.println();
        Scorer s = new Scorer(d);
        int s1 = s.getScore();
        totalScore += s1;
        System.out.println("The score is:");
        System.out.println(s1);
        if (s1 < threshold){
            return;
        }
        PlayerUser d1 = new PlayerUser(totalScore, s.notUsed());
        String choice = d1.choice();
        System.out.println("the decision is " + choice );
        if (choice.equals("N")){
            scores[3] += totalScore;
        }
        else{
            p4(s.notUsed(), 1);
        }
    }
    public void play(){
        init();
        while (max()){
            totalScore = 0;
            System.out.println("For Player 1:");
            p1(5, 300);
            totalScore = 0;
            System.out.println("For Player 2:");
            p2(5, 300);
            totalScore = 0;
            System.out.println("For Player 3:");
            p3(5, 300);
            totalScore = 0;
            System.out.println("For Player 4 (you) :");
            p4(5, 300);
            System.out.print("Now everyone's score is ");
            for (int i=0; i<4; i++){
                System.out.print(scores[i] + " ");
            }
            System.out.println();
        }
        System.out.print("The winner is No." + (winner+1));
    }
    public static void main(String[] args){
        Game game = new Game();
        game.play();
    }
}
