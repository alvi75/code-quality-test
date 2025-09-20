using System;
using System.Collections.Generic;

public class Translation633
{
    public static long GenerationFromSegmentsFileName(string fileName){
    if (fileName.Equals(OLD_SEGMENTS_GEN, StringComparison.Ordinal)){
        throw new System.ArgumentException("\"" + OLD_SEGMENTS_GEN + "\" is not a valid segment file name since 4.0");
    }
    else if (fileName.Equals(IndexFileNames.SEGMENTS, StringComparison.Ordinal)){
        return -1;
    }
    else{
        Debug.Assert(!fileName.StartsWith(IndexFileNames.SEGMENTS, StringComparison.Ordinal));
        long gen = ParseLong(fileName, 0);
        if (gen < 0){
            throw new System.ArgumentException("Invalid segment file name '" + fileName + "' - must be a segment file name (without extension) in one of the following formats: " + IndexFileNames.SEGMENTS + ", " + IndexFileNames.SEGMENTS_GEN + ", " + IndexFileNames.DELTA + ")");
        }
        return gen;
    }
}
}