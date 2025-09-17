import java.util.*;

public class Translationtranslation_620 {
    public void inform(ResourceLoader loader) throws IOException {
        try {
            if (chunkerModelFile != null) {
                OpenNLPOpsFactory.getChunkerModel(chunkerModelFile, loader);
            }
        }
        catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}