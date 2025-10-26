ublic virtual WorkingTreeIterator.MetadataDiff CompareMetadata(DirCacheEntry entry){
    if (entry.IsAssumeValid){
        return WorkingTreeIterator.MetadataDiff.EQUAL;
    }
    if (entry.IsUpdateNeeded){
        return WorkingTreeIterator.MetadataDiff.DIFFER_BY_METADATA;
    }
    if (!entry.IsSmudged && entry.Length != (int)GetEntryLength()){
        return WorkingTreeIterator.MetadataDiff.DIFFER_BY_METADATA;
    }
    if (IsModeDifferent(entry.RawMode)){
        return WorkingTreeIterator.MetadataDiff.DIFFER_BY_METADATA;
    }
    long cacheLastModified = entry.LastModified;
    long fileLastModified = GetEntryLastModified();
    if (cacheLastModified % 1000 == 0 || fileLastModified % 1000 == 0){
        cacheLastModified = cacheLastModified - cacheLastModified % 1000;
        fileLastModified = fileLastModified - fileLastModified % 1000;
    }
    if (fileLastModified != cacheLastModified){
        return WorkingTreeIterator.MetadataDiff.DIFFER_BY_TIMESTAMP;
    }
    else{
        if (!entry.IsSmudged){
            return WorkingTreeIterator.MetadataDiff.EQUAL;
        }
        else{
            return WorkingTreeIterator.MetadataDiff.SMUDGED;
        }
    }
}