import java.util.*;

public class Translation724 {
    public WorkingTreeIterator.MetadataDiff compareMetadata( DirCacheEntry entry ){
    if ( entry.isAssumeValid() ) return WorkingTreeIterator.MetadataDiff.EQUAL;
    if ( entry.isFile() ) {
        if ( entry.getGeneration() != getGeneration() ) return WorkingTreeIterator.MetadataDiff.DIFFER_BY_GEN;
        return WorkingTreeIterator.MetadataDiff.IGNORE;
    }
    if ( entry.isDirectory() ) {
        if ( entry.getGeneration() != getGeneration() ) return WorkingTreeIterator.MetadataDiff.DIFFER_BY_GEN;
        return WorkingTreeIterator.MetadataDiff.LIST;
    }
    return WorkingTreeIterator.MetadataDiff.UNKNOWN;
}
}