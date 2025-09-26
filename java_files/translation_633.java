import java.util.*;

public class Translation633 {
    public static long generationFromSegmentsFileName(String fileName) {
    if (fileName.equals(IndexFileNames.SEGMENTS)) {
        return 0;
    }
    else if (fileName.startsWith(IndexFileNames.SEGMENTS, 0)) {
        return Long.parseLong(fileName.substring(1 + IndexFileNames.SEGMENTS.length()));
    }
    else {
        throw new IllegalArgumentException("fileName \"" + fileName + "\" is not a segments file");
    }
}
}