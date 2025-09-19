import java.util.*;

public class Translation633 {
    public static long generationFromSegmentsFileName(String fileName) {
    if (fileName.startsWith(IndexFileNames.SEGMENTS)) {
        int idx = 1 + IndexFileNames.SEGMENTS.length();
        while (idx < fileName.length() && fileName.charAt(idx) == ' ') idx++;
        long gen = Long.parseLong(fileName.substring(idx), Character.MAX_RADIX);
        if (gen <= 0) {
            throw new IllegalArgumentException("segments file has invalid generation: " + fileName);
        }
        return gen;
    }
    else {
        throw new IllegalArgumentException("fileName \"" + fileName + "\" is not a segments file");
    }
}
}