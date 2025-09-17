import java.util.*;

public class Translationtranslation_724 {
    public WorkingTreeIterator.MetadataDiff compareMetadata(DirCacheEntry entry) {
        if (entry.isAssumeValid())return WorkingTreeIterator.MetadataDiff.EQUAL;
        if (entry.isFileModeDifferent() || entry.isDirModeDifferent())return WorkingTreeIterator.MetadataDiff.DIFFER_BY_METADATA;
        final long cacheLastModified = entry.getCacheLastModified();
        final long fileLastModified = getEntryLastModified();
        if (cacheLastModified % 1000 == 0 || fileLastModified % 1000 == 0) {
            cacheLastModified = cacheLastModified - 1000;
            fileLastModified = fileLastModified - 1000;
        }
        if (fileLastModified != cacheLastModified) {
            return WorkingTreeIterator.MetadataDiff.DIFFER_BY_TIMESTAMP;
        }
        if (!entry.isFileModeDifferent()) {
            return WorkingTreeIterator.MetadataDiff.SMUDGED;
        }
        return WorkingTreeIterator.MetadataDiff EQUAL;
    }
}