package ucl.ac.uk.things;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Model {
    private HashMap<Integer, list> map = new HashMap<>();
    private int topId;

    public Model() {
        topId = 0;
        map.put(0, new list(topId, "Main", -1));
    }

    public void addElementToList(String name, int parent, int id, int type) {
        if (id == -1)
            id = ++topId;
        if (type == 0){
            list element = new list(id, name, parent);
            map.get(parent).addItem(element);
            map.put(id, element);
        }
        else{
            list element = new item(id, name, parent);
            map.get(parent).addItem(element);
            map.put(id, element);
        }
    }
    public void deleteElement(int id) {
        for (list i: map.values()){
            if (i.findItem(id) != null){
                i.deleteThing(id);
            }
        }
        this.map.remove(id);
        setTopID(Collections.max(map.keySet()));
    }
    public void addThingToItem(String type, String content, int itemID) {
        switch (type) {
            case "text" -> map.get(itemID).setTxt(content);
            case "url" -> map.get(itemID).setUrl(content);
            case "image" -> map.get(itemID).setImage(content);
        }
    }

    public void renameElement(String newName, int id) {
        map.get(id).rename(newName);
    }

    public ArrayList<list> search(String name) {
        ArrayList<list> result = new ArrayList<>();
        for (list i: map.values()){
            if (i.getName().equals(name)){
                result.add(i);
            }
        }
        return result;
    }

    public void setTopID(int topId) {
        this.topId = topId;
    }

    public HashMap<Integer, list> getHashMap() {
        return new HashMap<>(map);
    }

    public void loadFromDir(String dir) throws IOException {
        Reader r = new Reader(dir);
        r.loadFromFile();
        this.map = r.getMap();
        setTopID(Collections.max(map.keySet()));
    }

    public void save(String dir) throws IOException {
        Writer w = new Writer(map, dir);
        w.save();
    }
}
