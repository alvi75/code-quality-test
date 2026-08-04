import java.util.*;

public class Translation724 {
    public WorkingTreeIterator.MetadataDiff compareMetadata(DirCacheEntry entry) {
    if (entry.isAssumeValid())return WorkingTreeIterator.MetadataDiff.EQUAL;
    if (entry.isUpdateNeeded())return WorkingTreeIterator.MetadataDiff.DIFFER_BY_METADATA;
    if (!entry.isSmudged() && entry.getLength() != getEntryLength())return WorkingTreeIterator.MetadataDiff.DIFFER_BY_METADATA;
    if (isModeDifferent(entry.getRawMode()))return WorkingTreeIterator.MetadataDiff.DIFFER_BY_METADATA;
    long cacheLastModified = entry.getLastModified();
    long fileLastModified = getEntryLastModified();
    if (cacheLastModified % 1000 == 0 || fileLastModified % 1000 == 0)cacheLastModified = cacheLastModified - cacheLastModified % 1000;
    fileLastModified = fileLastModified - fileLastModified % 1000;
    if (fileLastModified != cacheLastModified)return WorkingTreeIterator.MetadataDiff.DIFFER_BY_TIMESTAMP;
    else{
        if (!entry.isSmudged())return WorkingTreeIterator.MetadataDiff.EQUAL;
        else return WorkingTreeIterator.MetadataDiff.SMUDGED;
    }
}
}
}