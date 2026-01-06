import java.util.*;

public class Translation633 {
    public static long generationFromSegmentsFileName(String fileName) {
    if (fileName.equals(IndexFileNames.SEGMENTS, StringComparison.Ordinal)) {
        return 0;
    }
    else if (fileName.startsWith(IndexFileNames.SEGMENTS, StringComparison.Ordinal)) {
        return Long.parseLong(fileName.substring(1 + IndexFileNames.SEGMENTS.length), Character.MAX_RADIX);
    }
    else {
        throw new IllegalArgumentException("fileName \"" + fileName + "\" is not a segments file");
    }
}
}