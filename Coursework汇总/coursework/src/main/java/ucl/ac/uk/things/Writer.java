package ucl.ac.uk.things;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Writer {
    private HashMap<Integer, list> map;
    private String dir;

    public Writer(HashMap<Integer, list> map, String dir) {
        this.map = map;
        this.dir = dir;
    }

    public void save() throws IOException {
        clear();
        FileWriter fw = new FileWriter(dir + "data.csv");
        fw.write("ID, name, type, parent\n");
        for (list l : map.values()) {
            if (l.getParent() != -1) {
                fw.write(l.getId() + "," + l.getName() + "," + l.getType() + "," + l.getParent() + "\n");
                if (l.getType() == 1) {
                    FileWriter fw2 = new FileWriter(dir + "files" + File.separator + l.getId() + "t.txt");
                    fw2.write(l.getTxt());
                    fw2.close();
                    FileWriter fw3 = new FileWriter(dir + "files" + File.separator + l.getId() + "u.txt");
                    fw3.write(l.getUrl());
                    fw3.close();
                    FileWriter fw4 = new FileWriter(dir + "files" + File.separator + l.getId() + "i.txt");
                    fw4.write(l.getImage());
                    fw4.close();
                }
            }
        }
        fw.close();
    }
    private void clear() {
        File[] files = new File(dir + "files").listFiles();
        if (files != null) {
            for (File f : files) {
                f.delete();
            }
        }
    }
}