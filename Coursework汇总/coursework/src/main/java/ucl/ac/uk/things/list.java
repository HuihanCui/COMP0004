package ucl.ac.uk.things;

import java.util.ArrayList;

public class list {
    private int type = 0;
    private int id;
    private int parent;
    private String name;
    private String txt;
    private String url;
    private String image;
    private ArrayList<list> lists = new ArrayList<>();
    public list(int id, String name, Integer parent){
        this.id = id;
        this.name = name;
        this.parent = parent;
    }
    public void addItem(list l){
        lists.add(l);
    }
    public list findItem(int id){
        for (list i : lists) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    private void addTxt(int id, String txt) {
        list current = findItem(id);
        if (current != null){
            current.setTxt(txt);
        }
    }
    private void addUrl(int id, String txt) {
        list current = findItem(id);
        if (current != null){
            current.setUrl(txt);
        }
    }
    private void addImage(int id, String txt) {
        list current = findItem(id);
        if (current != null) {
            current.setImage(txt);
        }
    }
    public void rename(String newName){
        name = newName;
    }
    public void deleteThing(int id){
        list current = findItem(id);
        lists.remove(current);
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public ArrayList<list> getLists(){
        return new ArrayList<list>(lists);
    }
    public void setTxt(String newTxt){
        txt = newTxt;
    }
    public void setUrl(String newUrl){
        url = newUrl;
    }
    public void setImage(String newImage){
        image = newImage;
    }
    public String getTxt(){
        return txt;
    }
    public String getUrl(){
        return url;
    }
    public String getImage(){
        return image;
    }
    public int getType(){
        return type;
    }
    public Integer getParent(){
        return parent;
    }
}
