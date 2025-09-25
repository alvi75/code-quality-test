import java.util.*;

public class Translation633 {
    public static long generationFromSegmentsFileName(String fileName) {
    if (fileName.equals(SegmentsWriter.SEGMENTS)) {
        return 0;
    }
    else if (fileName.startsWith(SegmentsWriter.SEGMENTS)) {
        final String name = fileName.substring(SegmentsWriter.SEGMENTS.length());
        try {
            return Long.parseLong(name);
        }
    }
    else {
        throw new IllegalArgumentException("fileName \"" + fileName + "\" is not a segments file");
    }
}
}