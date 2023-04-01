public class Game extends Product{
    private int code;
    private int price;
    private String name;
    private String producer;
    private String platform;

    public Game(int code, int price, String name, String producer, String platform){
        super(code, price);
        this.name = name;
        this.producer = producer;
        this.platform = platform;
    }

    public String getDescription(){
        String str = "The game " + name + " is by " + producer + " on " + platform;
        return str;
    }
}
