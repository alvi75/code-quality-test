import java.util.*;

public class Translation620 {
    public void inform(ResourceLoader loader) throws IOException {
    try {
        if (chunkerModelFile != null) {
            chunkerOp = OpenNLPOpsFactory.getChunkerModel(chunkerModelFile, loader);
        }
    }
    catch (IOException e) {
        throw new IllegalArgumentException(e);
    }
}
}