import java.util.*;

public class Translation620 {
    public void inform(ResourceLoader loader) throws IOException {
    try {
        if (chunkerModelFile != null) {
            openNLPOpsFactory.getChunkerModel(chunkerModelFile, loader);
        }
    }
    catch (IOException e) {
        throw new IllegalArgumentException(e.toString());
    }
}
}