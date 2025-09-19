import java.util.*;

public class Translation633 {
    public static long generationFromSegmentsFileName(String fileName) throws IOException {
    if (fileName.startsWith(SegmentsFileName)) {
        if (fileName.equals(IndexFileNames.SEGMENTS_GEN)) {
            return -1;
        }
        else {
            return Long.parseLong(fileName.substring(IndexFileNames.SEGMENTS.length()));
        }
    }
}