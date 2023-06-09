package ucl.ac.uk.things;

import java.io.File;
import java.io.IOException;

public class ModelFactory {
    private static Model model;
    public static Model getModel() throws IOException {
        if (model == null) {
            model = new Model();
            model.loadFromDir("."  + File.separator);
        }
        return model;
    }
}
