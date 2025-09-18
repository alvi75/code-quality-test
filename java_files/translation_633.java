public static long generationFromSegmentsFileName(String fileName) {
    if (fileName.equals(IndexFileNames.SEGMENTS)) {
        return 0;
    }
    else if (fileName.startsWith(IndexFileNames.SEGMENTS)) {
        return Long.parseLong(fileName.substring(1+IndexFileNames.SEGMENTS.length()), RADIX);
    }
    else {
        throw new IllegalArgumentException("fileName=" + fileName + " does not look like a segments file");
    }
}