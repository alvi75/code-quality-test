import java.util.*;

public class Translationtranslation_620 {
    public void inform(ResourceLoader loader) {
        try {
            if (chunkerModelFile != null) {
                chunker = OpenNLPOpsFactory.getChunker(chunkerModelFile, loader);
            }
        }
        catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}