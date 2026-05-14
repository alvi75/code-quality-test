import java.util.*;

public class Translation633 {
    public static final long generationFromSegmentsFileName(String fileName) {
    if (fileName.equals(IndexFileNames.SEGMENTS)) {
        return 0;
    }
    else if (fileName.startsWith(IndexFileNames.SEGMENTS)) {
        String basename = fileName.substring(1+IndexFileNames.SEGMENTS.length());
        try {
            return Long.parseLong(basename);
        }
        catch (NumberFormatException nfe) {
            throw new IllegalArgumentException(nfe);
        }
    }
    else {
        throw new IllegalArgumentException("fileName \"" + fileName + "\" is not a segments file");
    }
}
}