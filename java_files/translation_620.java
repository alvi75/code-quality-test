import java.util.*;

public class Translationtranslation_620 {
    public void inform(ResourceLoader loader) throws IOException {
        try {
            if (chunkerModelFile != null) {
                chunkerOp = OpenNLPOpsFactory.getChunkerModel(chunkerModelFile, loader);
            }
            else {
                chunkerOp = OpenNLPOpsFactory.getDefaultChunkerOp();
            }
        }
}