import java.util.*;

public class Translation629 {
    public Entry getEntry(final String name) throws FileNotFoundException {
    if (excludes.contains(name))throw new FileNotFoundException(name);
    final Entry entry = directory.getEntry(name);
    if (entry == null) {
        String datFileName = IndexFileNames.segmentFileName(segmentName, "", Lucene50CompoundFormat.DATA_EXTENSION);
        throw new FileNotFoundException("No sub-file with name \"" + name + "\" found in compound file \"" + datFileName + "\"");
    }
    return wrapEntry(entry);
}
}