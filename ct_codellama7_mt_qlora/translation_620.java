import java.util.*;

public class Translation620 {
    public void inform(ResourceLoader loader) {
    try {
        if (chunkerModelFile != null) {
            OpenNLPOpsFactory.getChunkerModel(chunkerModelFile, loader);
        }
    }
    catch (IOException e) {
        throw new IllegalArgumentException(e.toString(), e);
    }
}
}