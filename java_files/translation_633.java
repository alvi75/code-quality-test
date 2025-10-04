import java.util.*;

public class Translation633 {
    public static long generationFromSegmentsFileName(String fileName) throws IOException {
    if (fileName.equals(IndexFileNames.fileNameFromGeneration(IndexFileNames.SEGMENTS,"",0)) {
        return 0;
    }
    else if (fileName.startsWith(IndexFileNames.fileNameFromGeneration(IndexFileNames.SEGMENTS,"",Long.MIN_VALUE)) {
        final int gen = Integer.parseInt(fileName.substring(1+INDEX_GEN.length));
        return gen == 0 ? 0 : gen;
    }
    else {
        throw new IllegalArgumentException("fileName " + fileName + " is not a valid segments filename");
    }
}
}