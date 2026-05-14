import java.util.*;

public class Translation620 {
    ublic void inform(ResourceLoader loader) {
    try {
        if (chunkerModelFile != null) {
            getChunkerModel(chunkerModelFile, loader);
        }
    }
    catch (IOException e) {
        throw new IllegalArgumentException(e.toString(), e);
    }
}
}