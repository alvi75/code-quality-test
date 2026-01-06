import java.util.*;

public class Translation724 {
    public MetadataDiff compareMetadata(DirCacheEntry entry) {
    if (entry.isAssumeValid()) {
        return EQUAL;
    }
    if (entry.isUpdateNeeded()) {
        return DIFFER_BY_METADATA;
    }
    if (!entry.isSmudged() && entry.length() != getEntryLength()) {
        return DIFFER_BY_METADATA;
    }
    if (isModeDifferent(entry.getRawMode())) {
        return DIFFER_BY_METADATA;
    }
    long cacheLastModified = entry.getLastModified();
    long fileLastModified = getEntryLastModified();
    if (cacheLastModified % 1000 == 0 || fileLastModified % 1000 == 0) {
        cacheLastModified = cacheLastModified - cacheLastModified % 1000;
        fileLastModified = fileLastModified - fileLastModified % 1000;
    }
    if (fileLastModified != cacheLastModified) {
        return DIFFER_BY_TIMESTAMP;
    }
    else if (!entry.isSmudged()) {
        return EQUAL;
    }
    else {
        return SMUDGED;
    }
}
}