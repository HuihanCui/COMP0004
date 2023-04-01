package ucl.ac.uk.things;

public class item extends list{
    private int type = 1;
    private int id;
    private int parent;
    private String name;
    private String txt;
    private String url;
    private String image;
    public item(int id, String name, int parent){
        super(id, name, parent);
    }

    public list findItem(int id){
        return null;
    }

}
