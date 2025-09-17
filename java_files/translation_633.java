import java.util.*;

public class Translationtranslation_633 {
    public static long generationFromSegmentsFileName(String fileName) throws IOException {
        if (fileName.startsWith(SEGMENTS)) {
            if (fileName.equals(SEGMENTS_GEN)) {
                return -1;
            }
            else {
                return Long.parseLong(fileName.substring(SEGMENTS.length()));
            }
        }
}