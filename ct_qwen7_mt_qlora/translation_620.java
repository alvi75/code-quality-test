import java.util.*;

public class Translation620 {
    1 public void inform(ResourceLoader loader) {
    2 try {
        3 if (chunkerModelFile != null)4 OpenNLPOpsFactory.getChunkerModel(chunkerModelFile, loader);
        5 }
        catch (IOException e) {
            6 throw new IllegalArgumentException(e.toString(), e);
            7 }
        }
}