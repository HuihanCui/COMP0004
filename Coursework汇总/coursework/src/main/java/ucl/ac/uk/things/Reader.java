package ucl.ac.uk.things;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Reader {
    private Model model;
    private String dir;

    public Reader(String dir) {
        this.model = new Model();
        this.dir = dir;
    }

    public void loadFromFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(dir + "data.csv"));
        String line;
        if ((line = br.readLine()) == null){
            throw new IOException("Empty file");
        }
        while ((line = br.readLine()) != null) {
            construct(line);
        }
        br.close();
    }

    private void construct(String line) throws IOException {
        String[] split = line.split(",");
        int id = Integer.parseInt(split[0]);
        String name = split[1];
        int type = Integer.parseInt(split[2]);
        int parent = Integer.parseInt(split[3]);
        model.addElementToList(name, parent, id, type);
        if (type == 1){
            load(id);
        }
    }
    public void loadTxt(int id) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(this.dir + "files" + File.separator + id + "t.txt"));
        String line;
        String content = "";
        while ((line = br.readLine()) != null)
            content += line;
        model.addThingToItem("text", content, id);
        br.close();
    }
    public void loadUrl(int id) throws IOException {
        BufferedReader b = new BufferedReader(new FileReader(this.dir + "files" + File.separator + id + "u.txt"));
        String line;
        String content = "";
        while ((line = b.readLine()) != null)
            content += line;
        model.addThingToItem("url", content, id);
        b.close();
    }
    public void loadImage(int id) throws IOException {
        BufferedReader b = new BufferedReader(new FileReader(this.dir + "files" + File.separator + id + "i.txt"));
        String line;
        String content = "";
        while ((line = b.readLine()) != null)
            content += line;
        model.addThingToItem("image", content, id);
        b.close();
    }
    public void load(int id) throws IOException{
        loadTxt(id);
        loadUrl(id);
        loadImage(id);
    }
    public HashMap<Integer, list> getMap() {
        return model.getHashMap();
    }
}
