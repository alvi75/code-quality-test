import java.util.*;

public class Translation620 {
    public void inform(ResourceLoader loader) throws IOException {
    if (chunkerModelFile != null) {
        openNLPOpsFactory.getChunkerModel(chunkerModelFile, loader);
    }
    else {
        throw new IllegalArgumentException("No chunker model file specified.");
    }
}
}